/**
 * @包名称 com.coky.designpattern.creationalpatterns.c03singleton.singleton
 * @文件名 SingletonLazySafe.java
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-10-28 下午1:43:38
 * @版权所有 ©2014 CTFO
 * @修改者 chenyang
 * @修改时间 2014-10-28 下午1:43:38
 * @修改描述 
 */

package com.coky.designpattern.creationalpatterns.c03singleton.singleton;

/** 
 * 功能描述 单例模式
 * 
 * 2.懒汉式，线程安全
 * 
 * 是否 Lazy 初始化：是
 * 
 * 是否多线程安全：是
 * 
 * 描述：这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
 * 
 * 优点：第一次调用才初始化，避免内存浪费。
 * 
 * 缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
 * getInstance() 的性能对应用程序不是很关键（该方法使用不太频繁）。
 */
public class Singleton2LazySafe {
	
	private static int count = 0;

	private static Singleton2LazySafe instance;
	
	private Singleton2LazySafe() {
		count++;
	}

	public static synchronized Singleton2LazySafe getInstance(){
		if(instance == null){
			instance = new Singleton2LazySafe();
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
