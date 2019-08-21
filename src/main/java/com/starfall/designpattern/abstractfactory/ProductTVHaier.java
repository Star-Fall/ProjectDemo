package com.starfall.designpattern.abstractfactory;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.abstractfactory
 * @className ProductTVHaier
 * @date 2019/8/21 16:02
 * @description Haier 海尔电视机
 */
public class ProductTVHaier implements ProductTV {
	@Override
	public void buyProductTV() {
		System.out.println("购买海尔电视机");
	}
}
