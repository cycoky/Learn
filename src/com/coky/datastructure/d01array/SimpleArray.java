/**
 * @包名称 com.coky.datastructure.d01array
 * @文件名 SimpleArray.java
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-11-11 上午11:20:48
 * @版权所有 ©2014 COKY
 * @修改者 chenyang
 * @修改时间 2014-11-11 上午11:20:48
 * @修改描述 
 */

package com.coky.datastructure.d01array;

/**
 * 功能描述  简单无需数据
 * @类型名称 SimpleArray
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-11-11 上午11:25:52
 * @版权所有 ©2014 COKY
 * @修改者 chenyang
 * @修改时间 2014-11-11 上午11:25:52
 * @修改描述
 */
public class SimpleArray {

	//无序数组
	protected int array[];
	//数据项个数
	protected int dataSize;
	//数组总大小
	protected int maxSize;
	
	public SimpleArray(int maxSize) {
		this.array = new int[maxSize];
		this.maxSize = maxSize;
		this.dataSize = 0;
	}

	public int getDataSize() {
		return dataSize;
	}

	public int getMaxSize() {
		return maxSize;
	}
	
	public void insert(int data){
		array[dataSize++] = data;
	}

	public void delete(int data){
		int index = find(data);
		if(index != -1){
			//将删除点之后的所有元素前移
			for (int i = index; i < dataSize - 1; i++) {
				array[i] = array[i+1];
			}
			array[dataSize - 1] = 0;
			System.out.println("删除第" + (index + 1) + "个元素： " + data);
			dataSize--;
		}
	}

	public int find(int data){
		for (int i = 0; i < array.length; i++) {
			if(array[i] == data){
				return i;
			}
		}
		return -1;
	}

	public void swap(int src, int des){
		int temp = array[src];
		array[src] = array[des];
		array[des] = temp;
	}

	public void display(){
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < dataSize; i++) {
			sb.append(array[i] + " ");
		}
		System.out.println("有序数组中元素为： " + sb.toString());
	}
}
