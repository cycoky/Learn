/**
 * @包名称 com.coky.datastructure.d05linklist
 * @文件名 LinkListApp.java
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-11-13 上午11:16:00
 * @版权所有 ©2014 COKY
 * @修改者 chenyang
 * @修改时间 2014-11-13 上午11:16:00
 * @修改描述 
 */

package com.coky.datastructure.d05linklist;

/** 
 * 功能描述 
 * @类型名称 LinkListApp
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-11-13 上午11:16:00
 * @版权所有 ©2014 COKY
 * @修改者 chenyang
 * @修改时间 2014-11-13 上午11:16:00
 * @修改描述 
 */
public class L02FirstLastLinkListApp {

	public static void main(String[] args) {
		L02FirstLasLinkList ll = new L02FirstLasLinkList();
		
		ll.insertFirst(new LData("Maomao", 7, "男"));
		ll.insertFirst(new LData("Bao", 8, "男"));
		ll.insertFirst(new LData("Yang", 6, "男"));
		ll.insertFirst(new LData("Ling", 12, "女"));
		ll.insertFirst(new LData("MissWang", 25, "女"));
		ll.display();
		
//		System.out.println("删除节点：" + ll.deleteFirst());
//		ll.display();
//		while(!ll.isEmpty()){
//			System.out.println("删除节点：" + ll.deleteFirst());
//		}
//		ll.display();
		
		ll.deleteFirst();
		ll.display();
		
		ll.insertLast(new LData("11", 11, "男"));
		ll.insertLast(new LData("22", 22, "男"));
		ll.insertFirst(new LData("33", 33, "女"));
		ll.display();
		
		while(!ll.isEmpty()){
			System.out.println("删除节点：" + ll.deleteFirst());
		}
		ll.insertLast(new LData("44", 44, "女"));
		ll.display();
		
	}
}
