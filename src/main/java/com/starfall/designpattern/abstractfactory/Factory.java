package com.starfall.designpattern.abstractfactory;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.abstractfactory
 * @className Factory
 * @date 2019/8/21 15:37
 * @description Factory 抽象工厂角色
 */
public interface Factory {

	/**
	 * 生产电视机
	 * 
	 * @return TV
	 */
	public ProductTV getProductTV();

	/**
	 * 生产电冰箱
	 * 
	 * @return 电冰箱
	 */
	public ProductFridge getProductFridge();
}
