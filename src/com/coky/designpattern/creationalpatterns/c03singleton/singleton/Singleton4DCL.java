/**
 * @包名称 com.coky.designpattern.creationalpatterns.c03singleton.singleton
 * @文件名 SingletonDCL.java
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-10-28 下午1:55:07
 * @版权所有 ©2014 CTFO
 * @修改者 chenyang
 * @修改时间 2014-10-28 下午1:55:07
 * @修改描述 
 */

package com.coky.designpattern.creationalpatterns.c03singleton.singleton;

/** 
 * 功能描述 单例模式
 * 
 * 4.双检锁/双重校验锁（DCL，即 double-checked locking）
 * 
 * JDK 版本：JDK1.5 起
 * 
 * 是否 Lazy 初始化：是
 * 
 * 是否多线程安全：是
 * 
 * 实现难度：较复杂
 * 
 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * getInstance() 的性能对应用程序很关键。
 */
public class Singleton4DCL {

	private static int count = 0;

	private static Singleton4DCL instance;
	
	private Singleton4DCL() {
		count++;
	}

	public static Singleton4DCL getInstance(){
		if(instance == null){
			synchronized(Singleton4DCL.class){
				instance = new Singleton4DCL();
			}
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
