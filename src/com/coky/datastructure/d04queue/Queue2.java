/**
 * @包名称 com.coky.datastructure.d04queue
 * @文件名 Queue2.java
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-11-12 下午1:56:22
 * @版权所有 ©2014 COKY
 * @修改者 chenyang
 * @修改时间 2014-11-12 下午1:56:22
 * @修改描述 
 */

package com.coky.datastructure.d04queue;

/**
 * 功能描述
 * 
 * @类型名称 Queue2
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-11-12 下午1:56:22
 * @版权所有 ©2014 COKY
 * @修改者 chenyang
 * @修改时间 2014-11-12 下午1:56:22
 * @修改描述
 */
public class Queue2 {

	private int[] array;

	private int maxSize;// 队列数组大小

	private int front;// 队头指针

	private int rear;// 队尾指针

	public Queue2(int s) {
		this.maxSize = s + 1;
		array = new int[maxSize];
		front = 0;
		rear = -1;
	}

	public void insert(int data) {
		if (isFull())
			throw new IllegalStateException("队列已满");
		if (rear == maxSize - 1) {
			rear = -1;
		}
		array[++rear] = data;
		System.out.println("入队："+data + "队尾指针值：" + rear);
	}

	public int remove() {
		if (isEmpty())
			throw new IllegalStateException("队列已空");
		int data = array[front++];
		if (front == maxSize) {
			front = 0;
		}
		System.out.println("出队："+data + "队头指针值：" + front);
		return data;
	}

	public int peek() {
		if (isEmpty())
			throw new IllegalStateException("队列已空");
		return array[front];
	}

	public boolean isEmpty() {
		return rear + 1 == front || front + maxSize - 1 == rear;
	}

	public boolean isFull() {
		return rear + 2 == front || front + maxSize - 2 == rear;
	}

	public static void main(String[] args) {
		Queue2 q = new Queue2(10);
		System.out.println(q.isEmpty());
		// q.peek();
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
