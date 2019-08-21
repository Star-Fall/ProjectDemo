package com.starfall.designpattern.abstractfactory;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.abstractfactory
 * @className FactoryHaier
 * @date 2019/8/21 15:59
 * @description Haier 海尔工厂，可以生产电视机和电冰箱
 */
public class FactoryHaier implements Factory {
	@Override
	public ProductTV getProductTV() {
		System.out.println("海尔工厂，生产Haier电视机");
		return new ProductTVHaier();
	}

	@Override
	public ProductFridge getProductFridge() {
		System.out.println("海尔工厂，生产Haier电冰箱");
		return new ProductFridgeHaier();
	}
}
