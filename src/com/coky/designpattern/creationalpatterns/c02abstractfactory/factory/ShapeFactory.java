/**
 * @包名称 com.coky.designpattern.creationalpatterns.c02abstractfactory.factory
 * @文件名 ShapeFactory.java
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-10-28 上午10:47:49
 * @版权所有 ©2014 CTFO
 * @修改者 chenyang
 * @修改时间 2014-10-28 上午10:47:49
 * @修改描述 
 */

package com.coky.designpattern.creationalpatterns.c02abstractfactory.factory;

import com.coky.designpattern.creationalpatterns.c01factorypattern.impl.Circle;
import com.coky.designpattern.creationalpatterns.c01factorypattern.impl.Rectangle;
import com.coky.designpattern.creationalpatterns.c01factorypattern.impl.Square;
import com.coky.designpattern.creationalpatterns.c01factorypattern.intf.IShape;
import com.coky.designpattern.creationalpatterns.c02abstractfactory.intf.IColor;

/** 
 * 功能描述 
 * @类型名称 ShapeFactory
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-10-28 上午10:47:49
 * @版权所有 ©2014 CTFO
 * @修改者 chenyang
 * @修改时间 2014-10-28 上午10:47:49
 * @修改描述 
 */
public class ShapeFactory extends AbstractFactory{

	@Override
	public IShape getShape(String shapeType) {
		if(shapeType == null){
			return null;
		}
		if(shapeType.equals(Circle.TYPE)){
			return new Circle();
		} else if(shapeType.equals(Rectangle.TYPE)){
			return new Rectangle();
		} else if(shapeType.equals(Square.TYPE)){
			return new Square();
		}
	
		return null;
	}

	@Override
	public IColor getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

}
