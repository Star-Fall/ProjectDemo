package com.starfall.designpattern.adapterpattern.ClassAdapter.example;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.adapterpattern.ClassAdapter.example
 * @className DC5V
 * @date 2019/9/4 14:50
 * @description 5V低电压，目标接口，期望输出5V电压
 */
public interface DC5V {
	/**
	 * 输出5V电压
	 * 
	 * @return 5V
	 */
	public int output5V();
}