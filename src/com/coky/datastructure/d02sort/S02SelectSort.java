/**
 * @包名称 com.coky.datastructure.d02sort
 * @文件名 SelectSort.java
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-11-11 下午3:52:02
 * @版权所有 ©2014 COKY
 * @修改者 chenyang
 * @修改时间 2014-11-11 下午3:52:02
 * @修改描述 
 */

package com.coky.datastructure.d02sort;

import com.coky.datastructure.d01array.SimpleArray;

/** 
 * 功能描述 
 * @类型名称 SelectSort
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-11-11 下午3:52:02
 * @版权所有 ©2014 COKY
 * @修改者 chenyang
 * @修改时间 2014-11-11 下午3:52:02
 * @修改描述 
 */
public class S02SelectSort extends SimpleArray implements ISort{

	public S02SelectSort(int maxSize) {
		super(maxSize);
	}

	@Override
	public void sort() {
		
		int min;//用于记录无序区中最小数的索引
		//外层循环
		for (int out = 0; out < dataSize; out++) {
			min = out;//首先假设当前循环开始的位置就是最小数
			//找出右侧无序区中最小数
			for (int in = out + 1; in < dataSize ; in++) {
				if(array[in] < array[min]){
					min = in;
				}
			}
			//与无序区中的第一个数（有序区后一个数）交换
			swap(out, min);
//			display();
		}
	}
	
	public static void main(String[] args) {
		int arr[] = { 8, 1, 5, 4, 3, 7, 9, 10, 2 };
		S02SelectSort sort = new S02SelectSort(10);
		for (int i = 0; i < arr.length; i++) {
			sort.insert(arr[i]);
//			sort.insert(i + 1);
		}
		System.out.println("排序前：");
		sort.display();
		
		sort.sort();
		
		System.out.println("排序后：");
		sort.display();
	}

}
