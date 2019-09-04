package com.starfall.designpattern.adapterpattern.ClassAdapter;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.adapterpattern.ClassAdapter
 * @className Adapter
 * @date 2019/9/4 14:05
 * @description 适配器，将适配者Adaptee转换成目标Target期待的方法。
 */
public class Adapter extends Adaptee implements Target {

	@Override
	public void tagertMethod() {
		System.out.println("适配器Adapter开始适配Adaptee");
		this.adapteeMethod();
		System.out.println("适配器Adapter结束适配Adaptee");
	}
}
