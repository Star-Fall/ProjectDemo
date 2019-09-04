package com.starfall.designpattern.adapterpattern.ObjectAdapter.example;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.adapterpattern.ObjectAdapter.example
 * @className AC
 * @date 2019/9/4 15:47
 * @description AC 源电压接口，被适配的角色
 */
public interface AC {
	/**
	 * 输出源电压
	 * 
	 * @return 源电压
	 */
	public int outputAC();
}
