/**
 * @包名称 com.coky.datastructure.d02sort
 * @文件名 InsertSort.java
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-11-11 下午4:27:51
 * @版权所有 ©2014 COKY
 * @修改者 chenyang
 * @修改时间 2014-11-11 下午4:27:51
 * @修改描述 
 */

package com.coky.datastructure.d02sort;

import com.coky.datastructure.d01array.SimpleArray;

/** 
 * 功能描述 
 * @类型名称 InsertSort
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-11-11 下午4:27:51
 * @版权所有 ©2014 COKY
 * @修改者 chenyang
 * @修改时间 2014-11-11 下午4:27:51
 * @修改描述 
 */
public class S03InsertSort extends SimpleArray implements ISort {

	public S03InsertSort(int maxSize) {
		super(maxSize);
	}

	@Override
	public void sort() {
		int in;
		for (int out = 1; out < dataSize; out++) {
			int temp = array[out];//缓存被标记的值（下方右移是会覆盖被标记值）
			in = out;
			//右移每一个比被标记值大的数字
			while(in >0 && array[in-1] >= temp){
				array[in] = array[in-1];
				in--;
			}
			array[in] = temp;//将被标记的值放入需要插入的位置
//			display();
		}

	}
	
	public static void main(String[] args) {
		int arr[] = {8,1,5,4,3,7,9,10,2};
		S03InsertSort sort = new S03InsertSort(10);
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
