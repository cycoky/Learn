/**
 * @包名称 com.coky.designpattern.creationalpatterns.c02abstractfactory.factory
 * @文件名 ColorFactory.java
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-10-28 上午10:50:09
 * @版权所有 ©2014 CTFO
 * @修改者 chenyang
 * @修改时间 2014-10-28 上午10:50:09
 * @修改描述 
 */

package com.coky.designpattern.creationalpatterns.c02abstractfactory.factory;

import com.coky.designpattern.creationalpatterns.c01factorypattern.intf.IShape;
import com.coky.designpattern.creationalpatterns.c02abstractfactory.impl.Blue;
import com.coky.designpattern.creationalpatterns.c02abstractfactory.impl.Green;
import com.coky.designpattern.creationalpatterns.c02abstractfactory.impl.Red;
import com.coky.designpattern.creationalpatterns.c02abstractfactory.intf.IColor;

/** 
 * 功能描述 
 * @类型名称 ColorFactory
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-10-28 上午10:50:09
 * @版权所有 ©2014 CTFO
 * @修改者 chenyang
 * @修改时间 2014-10-28 上午10:50:09
 * @修改描述 
 */
public class ColorFactory extends AbstractFactory {

	/* (non-Javadoc)
	 * @see com.coky.designpattern.creationalpatterns.c02abstractfactory.factory.AbstractFactory#getShape(java.lang.String)
	 */
	@Override
	public IShape getShape(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.coky.designpattern.creationalpatterns.c02abstractfactory.factory.AbstractFactory#getColor(java.lang.String)
	 */
	@Override
	public IColor getColor(String color) {
		if(color == null){
			return null;
		}
		if(color.equals("RED")){
			return new Red();
		}else if(color.equals("GREEN")){
			return new Green();
		}else if(color.equals("BLUE")){
			return new Blue();
		}
		
		return null;
	}

}
