/**
 * @包名称 com.coky.datastructure.d01array
 * @文件名 OrderArray.java
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-11-11 上午11:26:15
 * @版权所有 ©2014 COKY
 * @修改者 chenyang
 * @修改时间 2014-11-11 上午11:26:15
 * @修改描述 
 */

package com.coky.datastructure.d01array;

/** 
 * 功能描述 
 * @类型名称 OrderArray
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-11-11 上午11:26:15
 * @版权所有 ©2014 COKY
 * @修改者 chenyang
 * @修改时间 2014-11-11 上午11:26:15
 * @修改描述 
 */
public class OrderArray {

	private int[] ordArr;
	
	private int dataSize;
	
	private int maxSize;
	
	public OrderArray(int arraySize) {
		ordArr = new int[arraySize];
		maxSize = arraySize;
		dataSize = 0;
	}
	
	public int size(){
		return maxSize;
	}

	public int dataSize(){
		return dataSize;
	}

	public void clear(){
		dataSize = 0;
		
	}
	
	public void insert(int data){
		if(dataSize == maxSize){
			throw new RuntimeException("数组已满");
		}
		
		//寻找插入点
		//将插入点之后的所有元素（包括插入点）后移，然后插入数据
		int insertPos = 0;
		for (; insertPos < dataSize; insertPos++) {
			if(ordArr[insertPos] > data){
				break;
			}
		}
		for(int i = dataSize; i > insertPos; i--){
			ordArr[i] = ordArr[i - 1];
		}
		ordArr[insertPos] = data;
		dataSize++;
	}

	public void delete(int data){
		int index = binSearch(data);
		if(index >=0 && index < dataSize){
			//将删除点之后的所有元素前移
			for (int i = index; i < dataSize - 1; i++) {
				ordArr[i] = ordArr[i+1];
			}
			ordArr[dataSize - 1] = 0;
			System.out.println("删除第" + (index + 1) + "个元素： " + data);
			dataSize--;
		} else {
			System.out.println("can not find element : " + data);
		}
	}

	public int binSearch(int data){
		if(dataSize > 0 && data > 0){
			int lowerBound = 0;
			int upperBound = dataSize - 1;
			int currentIndex = 0;
			while(true){
				currentIndex = (lowerBound + upperBound)/2;
				if(ordArr[currentIndex] == data){
					return currentIndex;
				}else if(lowerBound > upperBound){
					return -1;
				}else{
					if(ordArr[currentIndex] < data){
						lowerBound = currentIndex + 1;
					}else{
						upperBound = currentIndex - 1;
					}
				}
			}
		}
		return -1;
	}

	public void display(){
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < dataSize; i++) {
			sb.append(ordArr[i] + " ");
		}
		System.out.println("有序数组中元素为： " + sb.toString());
	}

	
}
