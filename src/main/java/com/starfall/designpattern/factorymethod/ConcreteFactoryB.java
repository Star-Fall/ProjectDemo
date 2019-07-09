package com.starfall.designpattern.factorymethod;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.factorymethod
 * @className ConcreteFactoryB
 * @date 2019/7/9 17:29
 * @description ConcreteFactoryB
 */
public class ConcreteFactoryB implements Factory {
	@Override
	public Product getProduct() {
		System.out.println("工厂ConcreteFactoryB生产ConcreteProductB对象");
		return new ConcreteProductB();
	}
}
