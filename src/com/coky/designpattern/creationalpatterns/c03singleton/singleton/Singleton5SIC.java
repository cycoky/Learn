/**
 * @包名称 com.coky.designpattern.creationalpatterns.c03singleton.singleton
 * @文件名 SingletonSIC.java
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-10-28 下午1:59:48
 * @版权所有 ©2014 CTFO
 * @修改者 chenyang
 * @修改时间 2014-10-28 下午1:59:48
 * @修改描述 
 */

package com.coky.designpattern.creationalpatterns.c03singleton.singleton;

/** 
 * 功能描述 单例模式
 * 
 * 5.登记式/静态内部类（static inner class）
 * 
 * 是否 Lazy 初始化：是
 * 
 * 是否多线程安全：是
 * 
 * 描述：这种方式能达到双检锁方式一样的功效，但实现更简单。对静态域使用延迟初始化，应使用这种方式而不是双检锁方式。
 * 这种方式只适用于静态域的情况，双检锁方式可在实例域需要延迟初始化时使用。
 * 这种方式同样利用了 classloder 机制来保证初始化 instance 时只有一个线程，
 * 它跟第 3 种方式不同的是：第 3 种方式只要 Singleton 类被装载了，那么 instance 就会被实例化（没有达到 lazy loading 效果），
 * 而这种方式是 Singleton 类被装载了，instance 不一定被初始化。因为 SingletonHolder 类没有被主动使用，
 * 只有显示通过调用 getInstance 方法时，才会显示装载 SingletonHolder 类，从而实例化 instance。想象一下，
 * 如果实例化 instance 很消耗资源，所以想让它延迟加载，另外一方面，又不希望在 Singleton 类加载时就实例化，
 * 因为不能确保 Singleton 类还可能在其他的地方被主动使用从而被加载，那么这个时候实例化 instance 显然是不合适的。
 * 这个时候，这种方式相比第 3 种方式就显得很合理。
 * 
 */
public class Singleton5SIC {

	private static int count = 0;
	
	private static class SingletonHolder{
		private static Singleton5SIC INSTANCE = new Singleton5SIC();
	}

	private Singleton5SIC() {
		count++;
	}

	public static final Singleton5SIC getInstance(){
		return SingletonHolder.INSTANCE;
	}

	public void displayCount(){
		System.out.println(count);
	}

	public int getCount(){
		return count;
	}
}
