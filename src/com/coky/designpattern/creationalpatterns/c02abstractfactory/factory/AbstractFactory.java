/**
 * @包名称 com.coky.designpattern.creationalpatterns.c02abstractfactory.factory
 * @文件名 AbstractFactory.java
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-10-28 上午10:45:52
 * @版权所有 ©2014 CTFO
 * @修改者 chenyang
 * @修改时间 2014-10-28 上午10:45:52
 * @修改描述 
 */

package com.coky.designpattern.creationalpatterns.c02abstractfactory.factory;

import com.coky.designpattern.creationalpatterns.c01factorypattern.intf.IShape;
import com.coky.designpattern.creationalpatterns.c02abstractfactory.intf.IColor;

/** 
 * 功能描述 
 * @类型名称 AbstractFactory
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-10-28 上午10:45:52
 * @版权所有 ©2014 CTFO
 * @修改者 chenyang
 * @修改时间 2014-10-28 上午10:45:52
 * @修改描述 
 */
public abstract class AbstractFactory {

	public abstract IShape getShape(String type);
	
	public abstract IColor getColor(String color);
}
