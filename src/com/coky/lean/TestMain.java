package com.coky.lean;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.math.BigDecimal;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFHyperlink;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Hyperlink;
import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;

public class TestMain {

	public static void main(String[] args) {
		String path = "d:\\test.xls";
//		File file = new File(path);
//		
//		try {
//			HSSFWorkbook wb = new HSSFWorkbook(new FileInputStream(file));
//			
//			HSSFSheet sheet = wb.getSheetAt(0);
//			int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
//			for (int i = 0; i < physicalNumberOfRows; i++) {
//				HSSFRow row = sheet.getRow(i);
//				if (row != null){
//					int colCount = row.getPhysicalNumberOfCells();
//					for (int j = 0; j < colCount; j++) {
//						HSSFCell cell = row.getCell(j);
//						if(cell.getCellType() == HSSFCell.CELL_TYPE_NUMERIC){
//							System.out.println(cell.getNumericCellValue());
//						} else if(cell.getCellType() == HSSFCell.CELL_TYPE_STRING){
//							System.out.println(cell.getStringCellValue());
//						} else {
//							System.out.println("what");
//						}
//					}
//					
//				}
//			}
//			
//			
//			
//			
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		
		try {
			HSSFWorkbook wb = new HSSFWorkbook();
			
			HSSFSheet firstSheet = wb.createSheet("sheet1");
			
			HSSFSheet secondSheet = wb.createSheet("sheet2");
			
			HSSFSheet threeSheet = wb.createSheet("ABC");
			
			HSSFRow createRow = firstSheet.createRow(1);
			
			HSSFCell col1 = createRow.createCell(1);
			
			HSSFCell col2 = createRow.createCell(2);
			
			HSSFFont font = wb.createFont();
			font.setColor(HSSFColor.BLUE.index);
			font.setUnderline(HSSFFont.U_SINGLE);
			
			Hyperlink hyperlink = new HSSFHyperlink(HSSFHyperlink.LINK_DOCUMENT);
			hyperlink.setAddress("#'ABC'!A1");
			hyperlink.setLabel("链接");
			
			HSSFCellStyle cs = wb.createCellStyle();
			cs.setFont(font);
			col2.setCellStyle(cs);
			
			col1.setHyperlink(hyperlink);
			col1.setCellValue("点我");
//			col1.setCellStyle(cs);
			
			
			col2.setCellFormula("HYPERLINK(\"[test.xls]'sheet2'!A1\",\"click me\")");
			
			FileOutputStream fos = new FileOutputStream(path);
			
			wb.write(fos);
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File[] listRoots = File.listRoots();
		for (int i = 0; i < listRoots.length; i++) {
			System.out.println(listRoots[i].getPath());
		}
		
		int col = 26;
		
		System.out.println(Integer.toString(col, 26));
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < 26; i++) {
//			sb.append("\"").append((char)(65+i)).append(",").append("\"");
//		}
//		System.out.println(sb.toString());
//		
//		System.out.println((char)65);
		
		String colStr = String.valueOf(Integer.toString(col, 26));
		char[] charArray = colStr.toCharArray();
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < charArray.length; i++) {
			result.append((char)(65 + Character.digit(charArray[i], 10)-1));
//			System.out.println(Character.digit(charArray[i], 10));
		}
		
		System.out.println(result.toString());
		
		String content = "{\"display\":\"销售部门\", \"name\":\"saleDeptName\",\"type\":\"text\",\"width\":100,\"align\":\"center\"}";
		
		JsonFactory jf = new JsonFactory();
		try {
			JsonParser parser1 = jf.createJsonParser(content);
			
			while(parser1.nextToken() != JsonToken.END_OBJECT){
				String filedName = parser1.getCurrentName();
				
				if("display".equals(filedName)){
					parser1.nextToken();
					System.out.println(parser1.getText());
				}
				if("name".equals(filedName)){
					parser1.nextToken();
					System.out.println(parser1.getText());
				}
			}
			
			
		File f = new File("d:\\column.json");
		LineNumberReader lr = new LineNumberReader(new FileReader(f));
		String con = lr.readLine();
		StringBuilder column = new StringBuilder("String fixedHeader[] = {");
		StringBuilder width = new StringBuilder("int columnWidths[] = {");
		int columnCount = 0;
		while(con != null && !con.equals("")){
//			System.out.println(con);
			int index = con.indexOf("display:'");
			if(index != -1){
				String title = con.substring(con.indexOf("'") + 1, con.indexOf(",") - 1);
				column.append("\"");
				column.append(title);
				column.append("\", ");
				
				String fieldName = con.substring(con.indexOf("name:'") + 6, con.indexOf("',type"));
				String set = "setStringCellValue(row, colIndex++, getProperty(data, \"" + fieldName + "\"));// " + title;
//				String set = "${" + fieldName + "}";
				System.out.println(set);
				
				int startIndex = con.indexOf("width");
				if(startIndex == -1){
					startIndex = con.indexOf("minWidth");
					startIndex += 9;
				}else{
					startIndex += 6;
				}
				width.append(con.substring(startIndex, con.indexOf(",align")));
				width.append(", ");
				
				columnCount++;
			}
			
			con = lr.readLine();
		}
		System.out.println(column.delete(column.length() - 2, column.length()).append("};"));
		System.out.println(width.delete(width.length() - 2, width.length()).append("};"));
		System.out.println("列数为：" + columnCount);
			
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		BigDecimal bg = new BigDecimal(Double.MAX_VALUE);
		String string = bg.toPlainString();
		System.out.println(string);
		
		
		
		
	}
}
