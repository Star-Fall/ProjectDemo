package com.starfall.designpattern.simplefactory;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.simplefactory
 * @className ConcreteProductA
 * @date 2019/7/2 15:42
 * @description ConcreteProductA 具体产品角色A
 */
public class ConcreteProductA implements Product {
	@Override
	public void produce() {
		System.out.println("ConcreteProductA 生产：" + this.getClass().getName());
	}
}