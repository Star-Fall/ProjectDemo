package com.starfall.designpattern.factorymethod;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.factorymethod
 * @className Factory
 * @date 2019/7/9 17:17
 * @description Factory
 */
public interface Factory {
	/**
	 * 工厂方法
	 * 
	 * @return Product
	 */
	public Product getProduct();
}
