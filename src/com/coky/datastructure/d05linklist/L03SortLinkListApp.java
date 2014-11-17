/**
 * @包名称 com.coky.datastructure.d05linklist
 * @文件名 L03SortLinkListApp.java
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-11-13 下午4:17:25
 * @版权所有 ©2014 COKY
 * @修改者 chenyang
 * @修改时间 2014-11-13 下午4:17:25
 * @修改描述 
 */

package com.coky.datastructure.d05linklist;

import java.util.ArrayList;
import java.util.List;


/** 
 * 功能描述 
 * @类型名称 L03SortLinkListApp
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-11-13 下午4:17:25
 * @版权所有 ©2014 COKY
 * @修改者 chenyang
 * @修改时间 2014-11-13 下午4:17:25
 * @修改描述 
 */
public class L03SortLinkListApp {

	public static void main(String[] args) {
		L03SortLinkList ll = new L03SortLinkList();
		
		ll.insert(new LData("Maomao", 7, "男"));
		ll.display();
		ll.insert(new LData("Bao", 8, "男"));
		ll.display();
		ll.insert(new LData("Yang", 6, "男"));
		ll.display();
		ll.insert(new LData("Ling", 12, "女"));
		ll.display(); 
		ll.insert(new LData("MissWang", 25, "女"));
		ll.display();
		
		L03SortLinkList l = new L03SortLinkList();
		
		//可以利用有序链表进行排序，将无需数组中的数据逐个插入有序链表，然后再将链表数据从表头逐个移出复制给数组
		//根数组排序比，需要两倍空间，数组空间和链表空间
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*99);
		}
		
		System.out.print("排序前：");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] +" ");
		}
		
		System.out.println("");
		
		for (int i = 0; i < array.length; i++) {
			l.insert(new LData(array[i]));
		}
		int j = 0;
		while(!l.isEmpty()){
			array[j] = l.remove().getData().getAge();
			j++;
		}
		
		System.out.print("排序后：");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] +" ");
		}
		
		String str = "com.jd";
		String classFile=str.replaceAll("\\.","/");
	    System.out.println(classFile);
	    
	    System.out.println(func());
	    
	    List<Integer> list1=new ArrayList<Integer>();
	    list1.add(0);
	    List<Integer> list2=list1;
	    System.out.println(list1.get(0) instanceof Integer);
	    System.out.println(list2.get(0) instanceof Integer);
		
	}

	public static int func(){
	    try{
	        return 1;
	    }catch(Exception e){
	        return 2;
	    }finally{
//	        return 3;
	    	System.out.println("finally");
	    }
	}
}
