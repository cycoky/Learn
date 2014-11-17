/**
 * @包名称 com.coky.designpattern.creationalpatterns.c03singleton.demo
 * @文件名 SingletonDemo.java
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-10-28 下午2:13:27
 * @版权所有 ©2014 CTFO
 * @修改者 chenyang
 * @修改时间 2014-10-28 下午2:13:27
 * @修改描述 
 */

package com.coky.designpattern.creationalpatterns.c03singleton.demo;

import com.coky.designpattern.creationalpatterns.c03singleton.singleton.Singleton1LazyUnsafe;
import com.coky.designpattern.creationalpatterns.c03singleton.singleton.Singleton6Enum;

/** 
 * 功能描述 
 * @类型名称 SingletonDemo
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-10-28 下午2:13:27
 * @版权所有 ©2014 CTFO
 * @修改者 chenyang
 * @修改时间 2014-10-28 下午2:13:27
 * @修改描述 
 */
public class SingletonDemo {
	
	public static void main(String[] args) {
		
		Singleton6Enum instance = Singleton6Enum.INSTANCE;
		instance.displayCount("After the instance getted outer called,count = ");
		
		Singleton6Enum instance2 = Singleton6Enum.INSTANCE;
		instance2.displayCount("After the instance getted outer called,count = ");
		
		Singleton6Enum instance3 = Singleton6Enum.INSTANCE;
		instance3.displayCount("After the instance getted outer called,count = ");
		
		Singleton1LazyUnsafe singleton = Singleton1LazyUnsafe.getInstance();
		singleton.displayCount();
		
	}
	

}
