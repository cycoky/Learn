/**
 * @包名称 com.coky.designpattern.creationalpatterns.factorypattern.impl
 * @文件名 Square.java
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-10-28 上午10:19:42
 * @版权所有 ©2014 CTFO
 * @修改者 chenyang
 * @修改时间 2014-10-28 上午10:19:42
 * @修改描述 
 */

package com.coky.designpattern.creationalpatterns.c01factorypattern.impl;

import com.coky.designpattern.creationalpatterns.c01factorypattern.intf.IShape;

/** 
 * 功能描述 
 * @类型名称 Square
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-10-28 上午10:19:42
 * @版权所有 ©2014 CTFO
 * @修改者 chenyang
 * @修改时间 2014-10-28 上午10:19:42
 * @修改描述 
 */
public class Square implements IShape {
	
	public static final String TYPE = "SQUARE";

	/* (non-Javadoc)
	 * @see com.coky.designpattern.creationalpatterns.factorypattern.intf.IShape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method");

	}

}
