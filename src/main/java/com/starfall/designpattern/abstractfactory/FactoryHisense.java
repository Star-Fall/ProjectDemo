package com.starfall.designpattern.abstractfactory;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.abstractfactory
 * @className FactoryHisense
 * @date 2019/8/21 16:00
 * @description Hisense 海信工厂，可以生产电视机和电冰箱
 */
public class FactoryHisense implements Factory {
	@Override
	public ProductTV getProductTV() {
		System.out.println("海信工厂，生产Hisense电视机");
		return new ProductTVHisense();
	}

	@Override
	public ProductFridge getProductFridge() {
		System.out.println("海信工厂，生产Hisense电冰箱");
		return new ProductFridgeHisense();
	}
}
