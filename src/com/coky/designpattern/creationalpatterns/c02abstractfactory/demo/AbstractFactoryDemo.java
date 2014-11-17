/**
 * @包名称 com.coky.designpattern.creationalpatterns.c02abstractfactory.demo
 * @文件名 AbstractFactoryDemo.java
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-10-28 上午10:52:04
 * @版权所有 ©2014 CTFO
 * @修改者 chenyang
 * @修改时间 2014-10-28 上午10:52:04
 * @修改描述 
 */

package com.coky.designpattern.creationalpatterns.c02abstractfactory.demo;

import com.coky.designpattern.creationalpatterns.c01factorypattern.intf.IShape;
import com.coky.designpattern.creationalpatterns.c02abstractfactory.factory.AbstractFactory;
import com.coky.designpattern.creationalpatterns.c02abstractfactory.factory.FactoryProducer;
import com.coky.designpattern.creationalpatterns.c02abstractfactory.intf.IColor;

/** 
 * 功能描述 
 * @类型名称 AbstractFactoryDemo
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-10-28 上午10:52:04
 * @版权所有 ©2014 CTFO
 * @修改者 chenyang
 * @修改时间 2014-10-28 上午10:52:04
 * @修改描述 
 */
public class AbstractFactoryDemo {

	public static void main(String[] args) {
		
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

		IShape circle = shapeFactory.getShape("CIRCLE");
		circle.draw();
		
		IShape rectangle = shapeFactory.getShape("RECTANGLE");
		rectangle.draw();
		
		IShape square = shapeFactory.getShape("SQUARE");
		square.draw();
		
		
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		
		IColor red = colorFactory.getColor("RED");
		red.fill();
		
		IColor green = colorFactory.getColor("GREEN");
		green.fill();
		
		IColor blue = colorFactory.getColor("BLUE");
		blue.fill();
		
	}
}
