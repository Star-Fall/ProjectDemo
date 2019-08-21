package com.starfall.designpattern.abstractfactory;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.abstractfactory
 * @className ProductFridgeHaier
 * @date 2019/8/21 16:00
 * @description Haier 海尔电冰箱
 */
public class ProductFridgeHaier implements ProductFridge {
	@Override
	public void buyProductFridge() {
		System.out.println("购买海尔电冰箱ProductFridgeHaier");
	}
}
