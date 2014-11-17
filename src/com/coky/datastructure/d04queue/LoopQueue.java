/**
 * @包名称 com.coky.datastructure.d04queue
 * @文件名 LoopQueue.java
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-11-12 下午2:42:06
 * @版权所有 ©2014 COKY
 * @修改者 chenyang
 * @修改时间 2014-11-12 下午2:42:06
 * @修改描述 
 */

package com.coky.datastructure.d04queue;

/** 
 * 功能描述 
 * @类型名称 LoopQueue
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-11-12 下午2:42:06
 * @版权所有 ©2014 COKY
 * @修改者 chenyang
 * @修改时间 2014-11-12 下午2:42:06
 * @修改描述 
 */
public class LoopQueue<E> {

	private int DEFAULT_SIZE = 10;
	
	private int capacity;
	
	private E[] elementData;
	
	private int front = 0;
	
	private int rear = 0;
	
	@SuppressWarnings("unchecked")
	public LoopQueue(){
		this.capacity = DEFAULT_SIZE;
		elementData = (E[]) new Object[capacity];
	}

	public void enqueue(E data){
		if(isFull()){
			throw new IllegalStateException("队列已满");
		}
		elementData[rear++] = data;
		if(rear == capacity){
			rear = 0;
		}
		System.out.println("入队："+data + "队尾指针值：" + rear);
	}

	public E dequeue(){
		if(empty()){
			throw new IllegalStateException("队列已空");
		}
		E data = elementData[front];
		elementData[front++] = null;
		if(front == capacity){
			front = 0;
		}
		System.out.println("出队："+data + "队头指针值：" + front);
		return data;
	}

	public E element(){
		if(empty()){
			throw new IllegalStateException("队列已空");
		}
		return elementData[front];
	}

	public boolean empty(){
		return rear == front && elementData[front] == null;
	}

	public boolean isFull(){
		return rear == front && elementData[front] != null;
	}

	public static void main(String[] args) {
		LoopQueue<Integer> q = new LoopQueue<Integer>();
		System.out.println(q.empty());
//		 q.element();
		q.enqueue(1);
		System.out.println(q.empty());
		System.out.println(q.isFull());

		for (int i = 2; i < 11; i++) {
			q.enqueue(i);
		}
		System.out.println(q.isFull());
		
		for (int i = 0; i < 10; i++) {
			q.dequeue();
		}
		q.dequeue();
	}
	
	
}
