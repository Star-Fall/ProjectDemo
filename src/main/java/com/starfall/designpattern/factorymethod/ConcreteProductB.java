package com.starfall.designpattern.factorymethod;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.factorymethod
 * @className ConcreteProductB
 * @date 2019/7/9 17:17
 * @description ConcreteProductB 具体产品角色B
 */
public class ConcreteProductB extends Product {
	@Override
	public void produce() {
		System.out.println("ConcreteProductB 生产：" + this.getClass().getName());
	}
}