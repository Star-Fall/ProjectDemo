package com.starfall.designpattern.abstractfactory;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.abstractfactory
 * @className ProductFridgeHisense
 * @date 2019/8/21 16:01
 * @description Hisense 海信电冰箱
 */
public class ProductFridgeHisense implements ProductFridge {
	@Override
	public void buyProductFridge() {
		System.out.println("购买海信电冰箱ProductFridgeHisense");
	}
}
