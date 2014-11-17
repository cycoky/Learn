/**
 * @包名称 com.coky.datastructure.d05linklist
 * @文件名 Data.java
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-11-13 上午10:59:17
 * @版权所有 ©2014 COKY
 * @修改者 chenyang
 * @修改时间 2014-11-13 上午10:59:17
 * @修改描述 
 */

package com.coky.datastructure.d05linklist;

/** 
 * 功能描述 
 * @类型名称 Data
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-11-13 上午10:59:17
 * @版权所有 ©2014 COKY
 * @修改者 chenyang
 * @修改时间 2014-11-13 上午10:59:17
 * @修改描述 
 */
public class LData {
	
	private static int count = 0;

	private String name;
	
	private int age = 20;
	
	private String sex = "男";
	
	private int key = 0;

	public LData(int age) {
		this.name = "MR";
		this.age = age;
	}

	public LData(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		key = ++count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getKey(){
		return key;
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb
		.append("【")
		.append("姓名：")
		.append(name)
		.append(" 年龄：").append(age).append(" 性别：").append(sex)
		.append("】");
		return sb.toString();
	}
}
