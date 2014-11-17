/**
 * @包名称 com.coky.designpattern.creationalpatterns.c03singleton.singleton
 * @文件名 Singleton.java
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-10-28 下午1:38:11
 * @版权所有 ©2014 COKY
 * @修改者 chenyang
 * @修改时间 2014-10-28 下午1:38:11
 * @修改描述 
 */

package com.coky.designpattern.creationalpatterns.c03singleton.singleton;

/** 
 * 功能描述 单例模式
 * 
 * 1.懒汉式,线程不安全
 * 
 * 是否 Lazy 初始化：是
 * 
 * 是否多线程安全：否
 * 
 * 描述：这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
 * 这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。
 */
public class Singleton1LazyUnsafe {

	private static int count = 0;

	private static Singleton1LazyUnsafe instance;
	
	private Singleton1LazyUnsafe(){
		count++;
	}

	public static Singleton1LazyUnsafe getInstance(){
		if(instance == null){
			instance = new Singleton1LazyUnsafe();
		}
		return instance;
	}

	public void displayCount(){
		System.out.println(count);
	}

	public int getCount(){
		return count;
	}
}
