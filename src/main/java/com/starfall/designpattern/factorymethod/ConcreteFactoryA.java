package com.starfall.designpattern.factorymethod;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.factorymethod
 * @className ConcreteFactoryA
 * @date 2019/7/9 17:25
 * @description ConcreteFactoryA
 */
public class ConcreteFactoryA implements Factory {
	@Override
	public Product getProduct() {
		System.out.println("工厂ConcreteFactoryA生产ConcreteProductA对象");
		return new ConcreteProductA();
	}
}
