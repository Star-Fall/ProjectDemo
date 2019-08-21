package com.starfall.designpattern.abstractfactory;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.abstractfactory
 * @className ProductTVHisense
 * @date 2019/8/21 16:02
 * @description Hisense 海信电视机
 */
public class ProductTVHisense implements ProductTV {
	@Override
	public void buyProductTV() {
		System.out.println("购买海信电视机");
	}
}
