/**
 * @包名称 com.coky.designpattern.creationalpatterns.c03singleton.singleton
 * @文件名 SingletonUnlazySafe.java
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-10-28 下午1:48:54
 * @版权所有 ©2014 CTFO
 * @修改者 chenyang
 * @修改时间 2014-10-28 下午1:48:54
 * @修改描述 
 */

package com.coky.designpattern.creationalpatterns.c03singleton.singleton;

/** 
 * 功能描述  单例模式
 * 
 * 3.饿汉式，线程安全
 * 
 * 是否 Lazy 初始化：否
 * 
 * 是否多线程安全：是
 * 
 * 描述：这种方式比较常用，但是容易产生垃圾对象。
 * 
 * 优点：没有加锁，执行效率会提高。
 * 
 * 缺点：类加载时就初始化，浪费内存。
 * 
 * 她给予classloder机制避免了多线程的同步问题，不过，instance在类装载时就实例化，虽然导致类装载的原因有很多种，在单例模式
 * 中多数都是调用getInstance方法，但是也不能确定有其他的方式（或者其他的静态方法）导致类加载，这时候初始化instance显然
 * 没有叨叨lazy loading的效果。
 */
public class Singleton3UnlazySafe {

	private static int count = 0;
	
	// 类装载时直接初始化实例对象
	private static Singleton3UnlazySafe instance = new Singleton3UnlazySafe();
	
	private Singleton3UnlazySafe() {
		count++;
	}

	public static Singleton3UnlazySafe getInstance(){
		return instance;
	}

	public void displayCount(){
		System.out.println(count);
	}

	public int getCount(){
		return count;
	}
}
