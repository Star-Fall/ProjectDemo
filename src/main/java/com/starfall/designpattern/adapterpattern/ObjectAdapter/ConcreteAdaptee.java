package com.starfall.designpattern.adapterpattern.ObjectAdapter;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.adapterpattern.ObjectAdapter
 * @className ConcreteAdaptee
 * @date 2019/9/4 15:15
 * @description 具体的适配者
 */
public class ConcreteAdaptee implements Adaptee {
	@Override
	public void adapteeMethod() {
		System.out.println("调用具体的适配者方法：ConcreteAdaptee.adapteeMethod");
	}
}
