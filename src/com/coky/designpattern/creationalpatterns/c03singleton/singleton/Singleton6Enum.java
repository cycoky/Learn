/**
 * @包名称 com.coky.designpattern.creationalpatterns.c03singleton.singleton
 * @文件名 SingletonEnum.java
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-10-28 下午2:11:01
 * @版权所有 ©2014 CTFO
 * @修改者 chenyang
 * @修改时间 2014-10-28 下午2:11:01
 * @修改描述 
 */

package com.coky.designpattern.creationalpatterns.c03singleton.singleton;

/** 
 * 功能描述 单例模式
 * 
 * 6.枚举实现
 * 
 * JDK 版本：JDK1.5 起

 * 是否 Lazy 初始化：否
 * 
 * 是否多线程安全：是
 * 
 * 实现难度：易
 * 
 * 描述：这种实现方式还没有被广泛采用，但这是实现单例模式的最佳方法。它更简洁，自动支持序列化机制，绝对防止多次实例化。
 * 这种方式是 Effective Java 作者 Josh Bloch 提倡的方式，它不仅能避免多线程同步问题，而且还自动支持序列化机制，
 * 防止反序列化重新创建新的对象，绝对防止多次实例化。不过，由于 JDK1.5 之后才加入 enum 特性，用这种方式写不免让人感觉生疏，在实际工作中，也很少用。
 * 不能通过 reflection attack 来调用私有构造方法。
 */
public enum Singleton6Enum {

	INSTANCE;
	
	private static int count = 0;
	
	private Singleton6Enum() {
		record();
		System.out.println("Singleton6Enum 的构造方法被调用");
		displayCount("After constructor be called,count = ");
	}

	private void record(){
		count++;
	}
	
	public void whatEverMethod(){
		System.out.println("Say something...");
	}

	public void displayCount(String message){
		System.out.println(message + count);
	}

	public int getCount(){
		return count;
	}
}
