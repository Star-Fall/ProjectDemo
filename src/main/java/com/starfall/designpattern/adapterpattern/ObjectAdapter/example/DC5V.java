package com.starfall.designpattern.adapterpattern.ObjectAdapter.example;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.adapterpattern.ObjectAdapter.example
 * @className DC5V
 * @date 2019/9/4 15:46
 * @description 5V电压，目标接口
 */
public interface DC5V {
	/**
	 * 目标方法：输出5V电压
	 * 
	 * @return 5V
	 */
	public int output5V();
}
