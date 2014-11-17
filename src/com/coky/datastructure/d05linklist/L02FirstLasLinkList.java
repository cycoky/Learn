/**
 * @包名称 com.coky.datastructure.d05linklist
 * @文件名 FirstLasLinkList.java
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-11-13 下午2:34:26
 * @版权所有 ©2014 COKY
 * @修改者 chenyang
 * @修改时间 2014-11-13 下午2:34:26
 * @修改描述 
 */

package com.coky.datastructure.d05linklist;

/** 
 * 功能描述 : 双端单向链表，
 * 比普通单向链表多一个指向为列表尾节点的指针
 * 方便在链表为插入节点
 * 
 * @类型名称 FirstLasLinkList
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-11-13 下午2:34:26
 * @版权所有 ©2014 COKY
 * @修改者 chenyang
 * @修改时间 2014-11-13 下午2:34:26
 * @修改描述 
 */
public class L02FirstLasLinkList {

	private LNode first;
	
	private LNode last;
	
	public L02FirstLasLinkList(){
		first = null;
		last = null;
	}
	
	/**
	 * 功能描述：在链表表头插入元素
	 * @param data
	 */
	public void insertFirst(LData data){
		LNode newNode = new LNode(data);
		if(isEmpty()){
			last = newNode;
		}
		newNode.setNext(first);
		first = newNode;
	}

	/**
	 * 功能描述：删除链表第一个元素
	 * @return
	 */
	public LNode deleteFirst(){
		LNode temp = first;
		
		first = first.getNext();
		if(isEmpty()){
			last = null;
		}
		temp.setNext(null);
		
		return temp;
	}

	/**
	 * 功能描述：链表尾部插入元素
	 * @param data
	 */
	public void insertLast(LData data){
		LNode newNode = new LNode(data);
		if(isEmpty()){
			first = newNode;
		}else{
			last.setNext(newNode);
		}
		last = newNode;
	}
	
	/**
	 * 还是没法直接做到直接删除最后一个，因为需要知道倒数第二个节点，需要将它的next置为null
	 * 双向列表中实现
	 */
	public LNode deleteLast(){
		throw new RuntimeException("未支持");
	}

	public boolean isEmpty(){
		return first == null;
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
}
