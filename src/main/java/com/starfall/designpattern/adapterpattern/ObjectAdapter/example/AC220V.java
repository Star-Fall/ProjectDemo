package com.starfall.designpattern.adapterpattern.ObjectAdapter.example;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.adapterpattern.ObjectAdapter.example
 * @className AC220V
 * @date 2019/9/4 15:48
 * @description 具体源电压220V
 */
public class AC220V implements AC {
	@Override
	public int outputAC() {
		int outputAC = 220;
		System.out.println("源电压：" + outputAC);
		return outputAC;
	}
}
