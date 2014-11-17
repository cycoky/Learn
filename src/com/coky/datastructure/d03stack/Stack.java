/**
 * @包名称 com.coky.datastructure.d03stack
 * @文件名 Stack.java
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-11-12 上午10:05:48
 * @版权所有 ©2014 COKY
 * @修改者 chenyang
 * @修改时间 2014-11-12 上午10:05:48
 * @修改描述 
 */

package com.coky.datastructure.d03stack;


/** 
 * 功能描述 
 * @类型名称 Stack
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-11-12 上午10:05:48
 * @版权所有 ©2014 COKY
 * @修改者 chenyang
 * @修改时间 2014-11-12 上午10:05:48
 * @修改描述 
 */
public class Stack<E> {

	private E[] stackArray;//栈数据存储数组
	
	private int maxSize;//栈最大容量
	
	private int top = -1;//栈指针
	
	@SuppressWarnings("unchecked")
	public Stack(int maxSize) {
		this.maxSize = maxSize;
		stackArray = (E[]) new Object[maxSize];
	}

	public E pop() throws IllegalAccessException{
		if(isEmpty()){
			throw new IllegalAccessException("栈已空");
		}
		return (E) stackArray[top--];
	}

	public E peek() throws IllegalAccessException{
		if(isEmpty()){
			throw new IllegalAccessException("栈已空");
		}
		return (E) stackArray[top];
	}

	public void push(E data) throws IllegalAccessException{
		if(isFull()){
			throw new IllegalAccessException("栈已满");
		}
		stackArray[++top] = data;
	}


	public boolean isEmpty(){
		return top == -1;
	}

	public boolean isFull(){
		return top == maxSize - 1;
	}
	
	public static void main(String[] args) throws IllegalAccessException {
		String str1 = "HelloWorld";
		int length = str1.length();
		Stack<Object> test = new Stack<Object>(length);
		String output = "";
		for (int i = 0; i < length; i++) {
			test.push(str1.charAt(i));
		}
		while(!test.isEmpty()){
			output = output + test.pop();
		}
		System.out.println("逆序后的单词：" + output);
	}
}
