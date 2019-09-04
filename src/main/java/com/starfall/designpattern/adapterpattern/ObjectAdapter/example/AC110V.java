package com.starfall.designpattern.adapterpattern.ObjectAdapter.example;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.adapterpattern.ObjectAdapter.example
 * @className AC110V
 * @date 2019/9/4 15:49
 * @description 具体电压110V
 */
public class AC110V implements AC {
	@Override
	public int outputAC() {
		int outputAC = 110;
        System.out.println("源电压："+outputAC);
		return outputAC;
	}
}
