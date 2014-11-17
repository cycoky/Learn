/**
 * @包名称 com.coky.designpattern.creationalpatterns.c03singleton.demo
 * @文件名 Singleton6Enum.java
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-10-28 下午2:56:47
 * @版权所有 ©2014 CTFO
 * @修改者 chenyang
 * @修改时间 2014-10-28 下午2:56:47
 * @修改描述 
 */

package com.coky.designpattern.creationalpatterns.c03singleton.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.coky.designpattern.creationalpatterns.c03singleton.singleton.Singleton6Enum;

/** 
 * 功能描述 
 * @类型名称 Singleton6Enum
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-10-28 下午2:56:47
 * @版权所有 ©2014 CTFO
 * @修改者 chenyang
 * @修改时间 2014-10-28 下午2:56:47
 * @修改描述 
 */
public class Singleton6EnumTestCase {

	@Test
	public void test(){
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					Singleton6Enum instance = Singleton6Enum.INSTANCE;
					// 枚举类型获取实例是先调用构造方法，然后去初始化全局静态变量，所以count又被置为了0
					assertEquals(0, instance.getCount());
				}
			}
		});
		
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
//					Singleton2LazySafe.getInstance().displayCount();
					Singleton6Enum instance = Singleton6Enum.INSTANCE;
					assertEquals(0, instance.getCount());
				}
			}
		});
		
		t.start();
		t2.start();
	}
}
