/**
 * @包名称 com.coky.lean
 * @文件名 Clinet.java
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-11-14 下午3:31:58
 * @版权所有 ©2014 COKY
 * @修改者 chenyang
 * @修改时间 2014-11-14 下午3:31:58
 * @修改描述 
 */

package com.coky.lean;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.SortedMap;

/** 
 * 功能描述 
 * @类型名称 Clinet
 * @版本 1.0
 * @创建者 chenyang
 * @创建时间 2014-11-14 下午3:31:58
 * @版权所有 ©2014 COKY
 * @修改者 chenyang
 * @修改时间 2014-11-14 下午3:31:58
 * @修改描述 
 */
public class Client {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str="王";
		SortedMap<String,Charset> availableCharsets = Charset.availableCharsets();
		for (String key :availableCharsets.keySet()) {
			System.out.print(key +": ");
			System.out.print(availableCharsets.get(key).displayName() + "   ");
			
			System.out.println(new String(str.getBytes(), key));
		}
	}
}
