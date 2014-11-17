/**
 * @包名称 com.coky.datastructure.d05linklist
 * @文件名 L03SortLinkList.java
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-11-13 下午4:03:52
 * @版权所有 ©2014 COKY
 * @修改者 chenyang
 * @修改时间 2014-11-13 下午4:03:52
 * @修改描述 
 */

package com.coky.datastructure.d05linklist;

/** 
 * 功能描述 ：有序链表,优先级队列可以用该链表实现
 * @类型名称 L03SortLinkList
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-11-13 下午4:03:52
 * @版权所有 ©2014 COKY
 * @修改者 chenyang
 * @修改时间 2014-11-13 下午4:03:52
 * @修改描述 
 */
public class L03SortLinkList {

	private LNode first;
	
	public L03SortLinkList() {
		first = null;
	}
	
	/**
	 * 功能描述：需要比较数据的关键字大小，在适当的位置插入数据
	 * @param data
	 */
	public void insert(LData data){
		LNode newNode = new LNode(data);
		LNode current = first;
		LNode pre = null;
		
		while(current != null && data.getAge() > current.getData().getAge()){
			pre = current;
			current = current.getNext();
		}
		if(pre == null){
			first = newNode;
		}else{
			pre.setNext(newNode);
		}
		newNode.setNext(current);
	}

	public LNode remove(){
		if(isEmpty()){
			throw new IllegalStateException("链表已空");
		}
		LNode temp = first;
		first = first.getNext();
		temp.setNext(null);
		return temp;
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
