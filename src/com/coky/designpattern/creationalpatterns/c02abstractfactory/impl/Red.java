/**
 * @包名称 com.coky.designpattern.creationalpatterns.c02abstractfactory.impl
 * @文件名 Red.java
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-10-28 上午10:44:01
 * @版权所有 ©2014 CTFO
 * @修改者 chenyang
 * @修改时间 2014-10-28 上午10:44:01
 * @修改描述 
 */

package com.coky.designpattern.creationalpatterns.c02abstractfactory.impl;

import com.coky.designpattern.creationalpatterns.c02abstractfactory.intf.IColor;

/** 
 * 功能描述 
 * @类型名称 Red
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-10-28 上午10:44:01
 * @版权所有 ©2014 CTFO
 * @修改者 chenyang
 * @修改时间 2014-10-28 上午10:44:01
 * @修改描述 
 */
public class Red implements IColor {

	/* (non-Javadoc)
	 * @see com.coky.designpattern.creationalpatterns.c02abstractfactory.intf.IColor#fill()
	 */
	@Override
	public void fill() {
		System.out.println("Inside Red::fill() method");

	}

}
