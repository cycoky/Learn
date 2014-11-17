/**
 * @包名称 com.coky.datastructure.d02sort
 * @文件名 SortTimeCompare.java
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-11-11 下午5:03:51
 * @版权所有 ©2014 COKY
 * @修改者 chenyang
 * @修改时间 2014-11-11 下午5:03:51
 * @修改描述 
 */

package com.coky.datastructure.d02sort;

/** 
 * 功能描述 
 * @类型名称 SortTimeCompare
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-11-11 下午5:03:51
 * @版权所有 ©2014 COKY
 * @修改者 chenyang
 * @修改时间 2014-11-11 下午5:03:51
 * @修改描述 
 */
public class S04SortTimeCompareTest {

	public static void main(String[] args) {
		
		int size = 10000;
		
		S01BubbleSort bubbleSort = new S01BubbleSort(size);
		for (int i = size; i > 0; i--) {
//		for (int i = 1; i < size + 1; i++) {
			bubbleSort.insert(i);
//			bubbleSort.insert(i + 1);
		}
		System.out.println("排序前：");
		bubbleSort.display();
		long start = System.currentTimeMillis();
		bubbleSort.sort();
		System.out.println("冒泡排序用时: " + (System.currentTimeMillis() - start) + "ms");
		System.out.println("排序后：");
		bubbleSort.display();
		System.out.println("-------------------------------");
		
		
		S02SelectSort selectSort = new S02SelectSort(size);
		for (int i = size; i > 0; i--) {
//		for (int i = 1; i < size + 1; i++) {
			selectSort.insert(i);
//			selectSort.insert(i + 1);
		}
		System.out.println("排序前：");
		selectSort.display();
		long start1 = System.currentTimeMillis();
		selectSort.sort();
		System.out.println("选择排序用时: " + (System.currentTimeMillis() - start1) + "ms");
		System.out.println("排序后：");
		selectSort.display();
		System.out.println("-------------------------------");
		
		
		S03InsertSort insertSort = new S03InsertSort(size);
		for (int i = size; i > 0; i--) {
//		for (int i = 1; i < size + 1; i++) {
			insertSort.insert(i);
//			insertSort.insert(i + 1);
		}
		System.out.println("排序前：");
		insertSort.display();
		long start2 = System.currentTimeMillis();
		insertSort.sort();
		System.out.println("插入排序用时: " + (System.currentTimeMillis() - start2) + "ms");
		System.out.println("排序后：");
		insertSort.display();
	}
}
