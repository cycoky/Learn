/**
 * @包名称 com.coky.datastructure.d04queue
 * @文件名 Queue.java
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-11-12 下午1:28:38
 * @版权所有 ©2014 COKY
 * @修改者 chenyang
 * @修改时间 2014-11-12 下午1:28:38
 * @修改描述 
 */

package com.coky.datastructure.d04queue;

/** 
 * 功能描述 
 * @类型名称 Queue
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-11-12 下午1:28:38
 * @版权所有 ©2014 COKY
 * @修改者 chenyang
 * @修改时间 2014-11-12 下午1:28:38
 * @修改描述 
 */
public class Queue {

	private int[] array;
	
	private int maxSize;//队列数组大小
	
	private int dataSize;//记录队列的实际大小
	
	private int front;//对头指针
	
	private int rear;//对位指针
	
	public Queue(int maxSize) {
		this.maxSize = maxSize;
		array = new int[maxSize];
		dataSize = 0;
		
		front = 0;
		rear = -1;
	}

	public void insert(int data){
		if(isFull()) throw new IllegalStateException("队列已满");
		if(rear == maxSize - 1){
			rear = -1;
		}
		array[++rear] = data;
		dataSize++;
		System.out.println("入队："+data + "队尾指针值：" + rear);
	} 

	public int remove(){
		if(isEmpty()) throw new IllegalStateException("队列已空");
		int data = array[front++];
		if(front == maxSize){
			front = 0;
		}
		dataSize--;
		System.out.println("出队："+data + "队头指针值：" + front);
		return data;
	}

	public int peek(){
		if(isEmpty()) throw new IllegalStateException("队列已空");
		return 	array[front];
	}

	public boolean isEmpty(){
		return dataSize == 0;
	}
	
	public boolean isFull(){
		return dataSize == maxSize;
	}

	public int getDataSize(){
		return dataSize;
	}
	
	public static void main(String[] args) {
		Queue q = new Queue(10);
		System.out.println(q.isEmpty());
//		q.peek();
		q.insert(1);
		System.out.println(q.isEmpty());
		System.out.println(q.isFull());
		
		for (int i = 2; i < 11; i++) {
			q.insert(i);
		}
		System.out.println(q.isFull());
		q.insert(11);
	}
}
