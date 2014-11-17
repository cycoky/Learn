/**
 * @包名称 com.coky.datastructure.d01array
 * @文件名 OrderArrayTest.java
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-11-11 上午11:29:27
 * @版权所有 ©2014 COKY
 * @修改者 chenyang
 * @修改时间 2014-11-11 上午11:29:27
 * @修改描述 
 */

package com.coky.datastructure.d01array;

/** 
 * 功能描述 
 * @类型名称 OrderArrayTest
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-11-11 上午11:29:27
 * @版权所有 ©2014 COKY
 * @修改者 chenyang
 * @修改时间 2014-11-11 上午11:29:27
 * @修改描述 
 * 
 * 有序数组特点：
 * 1.查找快，由于使用折半查找（二分查找）查找速度较快
 * 2.插入和删除慢，由于需要保持数组的有序性，插入和删除都需要挪动空间
 * 
 * 无需数组：
 * 1.查找慢，需要逐个对比
 * 2.插入快，直接根据索引进行写入
 * 2.删除慢，需要挪动空间
 */
public class OrderArrayTest {

	public static void main(String[] args) {
		OrderArray ordArr = new OrderArray(100);
//		for (int i = 0; i < 100; i++) {
//			
//		}
		
		ordArr.insert(1);
		ordArr.insert(3);
		ordArr.insert(5);
		ordArr.insert(7);
		ordArr.insert(9);
		ordArr.insert(11);
		ordArr.insert(13);
		
		ordArr.display();
		
		ordArr.delete(4);
		
		ordArr.delete(3);
		ordArr.display();
		
		ordArr.insert(2);
		ordArr.display();
		
		ordArr.clear();
		ordArr.display();
		
		for (int i = 0; i < 100; i++) {
			ordArr.insert(i + 1);
		}
		ordArr.display();
		
//		ordArr.insert(101);
		
		ordArr.delete(100);
		ordArr.display();
		
		ordArr.insert(101);
		ordArr.display();
	}
}
