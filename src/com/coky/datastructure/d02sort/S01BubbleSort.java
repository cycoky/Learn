/**
 * @包名称 com.coky.datastructure.d02sort
 * @文件名 BubbleSort.java
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-11-11 下午3:20:53
 * @版权所有 ©2014 COKY
 * @修改者 chenyang
 * @修改时间 2014-11-11 下午3:20:53
 * @修改描述 
 */

package com.coky.datastructure.d02sort;

import com.coky.datastructure.d01array.SimpleArray;

/** 
 * 功能描述 
 * @类型名称 BubbleSort
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-11-11 下午3:20:53
 * @版权所有 ©2014 COKY
 * @修改者 chenyang
 * @修改时间 2014-11-11 下午3:20:53
 * @修改描述 
 */
public class S01BubbleSort extends SimpleArray implements ISort{

	public S01BubbleSort(int maxSize) {
		super(maxSize);
	}

	@Override
	public void sort() {
//		for(int i = 0; i < dataSize; i++){
//			for (int j = 0; j < dataSize; j++) {
//				if(array[j] > array[j+1]){
//					int temp = array[j];
//					array[j] = array[j+1];
//					array[j+1] = temp;
//				}
//			}
//		}
		
		boolean isSwap;
		
		for(int i = dataSize; i > 0; i--){
			isSwap = false;
			for (int j = 0; j < i - 1; j++) {
				if(array[j] > array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					isSwap = true;
				}
			}
			//某次冒泡中无交换说明数组已有序，无需继续，直接退出（冒泡的优化）
			if(!isSwap){
				break;
			}
//			display();
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {8,1,5,4,3,7,9,10,2};
		S01BubbleSort bubbleSort = new S01BubbleSort(10);
		for (int i = 0; i < arr.length; i++) {
			bubbleSort.insert(arr[i]);
//			bubbleSort.insert(i + 1);
		}
		System.out.println("排序前：");
		bubbleSort.display();
		
		bubbleSort.sort();
		
		System.out.println("排序后：");
		bubbleSort.display();
	}

}
