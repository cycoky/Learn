/**
 * @包名称 com.coky.designpattern.creationalpatterns.c03singleton.demo
 * @文件名 Singleton1LazyUnsafe.java
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-10-28 下午2:30:54
 * @版权所有 ©2014 CTFO
 * @修改者 chenyang
 * @修改时间 2014-10-28 下午2:30:54
 * @修改描述 
 */

package com.coky.designpattern.creationalpatterns.c03singleton.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.coky.designpattern.creationalpatterns.c03singleton.singleton.Singleton1LazyUnsafe;


/** 
 * 功能描述 
 * @类型名称 Singleton1LazyUnsafe
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-10-28 下午2:30:54
 * @版权所有 ©2014 CTFO
 * @修改者 chenyang
 * @修改时间 2014-10-28 下午2:30:54
 * @修改描述 
 */
public class Singleton1LazyUnsafeTestCase{
	
	@Test
	public void test(){
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					Singleton1LazyUnsafe instance = Singleton1LazyUnsafe.getInstance();
					assertEquals(1, instance.getCount());
				}
			}
		});
		
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
//					Singleton2LazySafe.getInstance().displayCount();
					Singleton1LazyUnsafe instance = Singleton1LazyUnsafe.getInstance();
					assertEquals(1, instance.getCount());
				}
			}
		});
		
		t.start();
		t2.start();
	}
	
}
