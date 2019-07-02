package com.starfall.designpattern.simplefactory;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.simplefactory
 * @className Product
 * @date 2019/7/2 15:41
 * @description Product 抽象产品角色
 */
public interface Product {
	public static final String PRODUCT_A = "A";
	public static final String PRODUCT_B = "B";

	/**
	 * 产品生产方法
	 */
	public void produce();
}
