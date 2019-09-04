package com.starfall.designpattern.adapterpattern.ClassAdapter;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.adapterpattern.ClassAdapter
 * @className Adaptee
 * @date 2019/9/4 14:04
 * @description 适配者类，被适配的对象
 */
public class Adaptee {
	/**
	 * 被适配的方法
	 */
	public void adapteeMethod() {
		System.out.println("被适配的方法：adapteeMethod");
	}
}
