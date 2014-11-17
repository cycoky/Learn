/**
 * @包名称 com.coky.designpattern.creationalpatterns.factorypattern.impl
 * @文件名 Circle.java
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-10-28 上午10:20:29
 * @版权所有 ©2014 CTFO
 * @修改者 chenyang
 * @修改时间 2014-10-28 上午10:20:29
 * @修改描述 
 */

package com.coky.designpattern.creationalpatterns.c01factorypattern.impl;

import com.coky.designpattern.creationalpatterns.c01factorypattern.intf.IShape;

/** 
 * 功能描述 
 * @类型名称 Circle
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-10-28 上午10:20:29
 * @版权所有 ©2014 CTFO
 * @修改者 chenyang
 * @修改时间 2014-10-28 上午10:20:29
 * @修改描述 
 */
public class Circle implements IShape {

	public static final String TYPE = "CIRCLE";

	/* (non-Javadoc)
	 * @see com.coky.designpattern.creationalpatterns.factorypattern.intf.IShape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");

	}

}
