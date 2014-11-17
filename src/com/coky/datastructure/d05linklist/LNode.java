package com.coky.datastructure.d05linklist;

public class LNode {

	private LData data;
	
	private LNode next;

	public LNode(LData data) {
		super();
		this.data = data;
	}
	
	public LNode(LData data, LNode next) {
		super();
		this.data = data;
		this.next = next;
	}

	public LData getData() {
		return data;
	}

	public void setData(LData data) {
		this.data = data;
	}

	public LNode getNext() {
		return next;
	}

	public void setNext(LNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(data.toString());
//		sb.append(" 下一个节点：").append(next == null ? "无" : next.toString());
		return sb.toString();
	}
	
}
