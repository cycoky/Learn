/**
 * @包名称 com.coky.designpattern.creationalpatterns.factorypattern.demo
 * @文件名 FactoryPatternDemo.java
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-10-28 上午10:27:29
 * @版权所有 ©2014 CTFO
 * @修改者 chenyang
 * @修改时间 2014-10-28 上午10:27:29
 * @修改描述 
 */

package com.coky.designpattern.creationalpatterns.c01factorypattern.demo;

import com.coky.designpattern.creationalpatterns.c01factorypattern.factory.ShapeFactory;
import com.coky.designpattern.creationalpatterns.c01factorypattern.intf.IShape;

/** 
 * 功能描述 
 * @类型名称 FactoryPatternDemo
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-10-28 上午10:27:29
 * @版权所有 ©2014 CTFO
 * @修改者 chenyang
 * @修改时间 2014-10-28 上午10:27:29
 * @修改描述 
 */
public class FactoryPatternDemo {
	
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		IShape circle = shapeFactory.getShape("CIRCLE");
		circle.draw();
		
		IShape rectangle = shapeFactory.getShape("RECTANGLE");
		rectangle.draw();
		
		IShape square = shapeFactory.getShape("SQUARE");
		square.draw();
	}

}
