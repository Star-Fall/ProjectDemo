package com.starfall.designpattern.adapterpattern.ClassAdapter.example;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.adapterpattern.ClassAdapter.example
 * @className AC220V
 * @date 2019/9/4 14:51
 * @description 家用电压220V，被适配的源角色
 */
public class AC220V {

	/**
	 * 输出220V
	 * 
	 * @return 220V
	 */
	public int output220V() {
		int output = 220;
		return output;
	}
}