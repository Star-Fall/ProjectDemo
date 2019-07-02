package com.starfall.designpattern.simplefactory;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.simplefactory
 * @className ConcreteProductB
 * @date 2019/7/2 15:42
 * @description ConcreteProductB 具体产品角色B
 */
public class ConcreteProductB implements Product {
	@Override
	public void produce() {
		System.out.println("ConcreteProductB 生产：" + this.getClass().getName());
	}
}