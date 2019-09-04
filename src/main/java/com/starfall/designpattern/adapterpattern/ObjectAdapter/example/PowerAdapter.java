package com.starfall.designpattern.adapterpattern.ObjectAdapter.example;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.adapterpattern.ObjectAdapter.example
 * @className PowerAdapter
 * @date 2019/9/4 15:51
 * @description 电压适配器，适配多种电压
 */
public class PowerAdapter implements DC5V {
	/**
	 * 源电压对象
	 */
	private AC ac;

	public PowerAdapter(AC ac) {
		this.ac = ac;
	}

	@Override
	public int output5V() {
		System.out.println("接通电源：");
		int outputAC = ac.outputAC();
		System.out.println("电压转换,降压倍数：" + outputAC / 5);
		return 5;
	}
}
