/**
 * @包名称 com.coky.datastructure.d05linklist
 * @文件名 LinkList.java
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-11-13 上午11:04:12
 * @版权所有 ©2014 COKY
 * @修改者 chenyang
 * @修改时间 2014-11-13 上午11:04:12
 * @修改描述 
 */

package com.coky.datastructure.d05linklist;

/** 
 * 功能描述 ：单向单端链表
 * 插入和删除效率高，复杂度O(1)
 * 
 * 查找效率低,复杂度O(N)
 * 
 * 如果需要在列表尾部插入元素，需要遍历链表直至尾部
 * 
 * 
 * @类型名称 LinkList
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-11-13 上午11:04:12
 * @版权所有 ©2014 COKY
 * @修改者 chenyang
 * @修改时间 2014-11-13 上午11:04:12
 * @修改描述 
 */
public class L01LinkList {

	private LNode first;

	public L01LinkList() {
		first = null;
	}
	
	public void insertFirst(LData data){
		LNode newNode = new LNode(data);
		newNode.setNext(first);
		first = newNode;
	}

	public LNode deleteFirst(){
		LNode temp = first;
		first = first.getNext();
		temp.setNext(null);
		
		return temp;
	}

	public void display(){
		LNode node = first;
		StringBuilder sb = new StringBuilder();
		while(node != null){
			sb.append(node.toString()).append("-->");
			node = node.getNext();
		}
		System.out.println(sb.toString());
	}

	public LNode find(int key){
		LNode current = first;
		while(current != null){
			LData data = current.getData();
			if(data.getKey() == key){
				return current;
			}
			current = current.getNext();
		}
		return null;
	}

	public LNode delete(int key){
		LNode current = first;
		LNode pre = null;
		while(current != null){
			LData data = current.getData();
			if(data.getKey() == key){
				if(pre == null){
					return deleteFirst();
				}else{
					pre.setNext(current.getNext());
					current.setNext(null);
					return current;
				}
			}
			pre = current;
			current = current.getNext();
		}
		
		return null;
	}

	public boolean isEmpty(){
		return first == null;
	}
}
