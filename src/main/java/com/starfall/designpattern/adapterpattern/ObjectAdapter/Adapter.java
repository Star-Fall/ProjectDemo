package com.starfall.designpattern.adapterpattern.ObjectAdapter;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.adapterpattern.ObjectAdapter
 * @className Adapter
 * @date 2019/9/4 15:11
 * @description Adapter适配器
 */
public class Adapter implements Target {
	/**
	 * 适配者对象
	 */
	private Adaptee adaptee;

	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void targetMethod() {
		System.out.println("适配器Adapter开始适配Adaptee");
		adaptee.adapteeMethod();
		System.out.println("适配器Adapter结束适配Adaptee");
	}
}
