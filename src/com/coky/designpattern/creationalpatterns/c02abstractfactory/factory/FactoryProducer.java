/**
 * @包名称 com.coky.designpattern.creationalpatterns.c02abstractfactory.factory
 * @文件名 FactoryProducer.java
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-10-28 上午10:53:17
 * @版权所有 ©2014 CTFO
 * @修改者 chenyang
 * @修改时间 2014-10-28 上午10:53:17
 * @修改描述 
 */

package com.coky.designpattern.creationalpatterns.c02abstractfactory.factory;

/** 
 * 功能描述 
 * @类型名称 FactoryProducer
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-10-28 上午10:53:17
 * @版权所有 ©2014 CTFO
 * @修改者 chenyang
 * @修改时间 2014-10-28 上午10:53:17
 * @修改描述 
 */
public class FactoryProducer {

	public static AbstractFactory getFactory(String choice){
		if(choice != null){
			if(choice.equals("SHAPE")){
				return new ShapeFactory();
			} else if(choice.equals("COLOR")){
				return new ColorFactory();
			}
		}
		
		return null;
	}
}
