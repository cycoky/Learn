package com.coky.designpattern.creationalpatterns.c03singleton.demo;

import static org.junit.Assert.*;

import org.junit.Test;

import com.coky.designpattern.creationalpatterns.c03singleton.singleton.Singleton2LazySafe;

public class Singleton2LazySafeTestCase {

	@Test
	public void test() {
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					Singleton2LazySafe instance = Singleton2LazySafe.getInstance();
					assertEquals(1, instance.getCount());
				}
			}
		});
		
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
//					Singleton2LazySafe.getInstance().displayCount();
					Singleton2LazySafe instance = Singleton2LazySafe.getInstance();
					assertEquals(1, instance.getCount());
				}
			}
		});
		
		t.start();
		t2.start();
	}

}
