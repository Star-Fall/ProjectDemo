package com.starfall.designpattern.adapterpattern.ClassAdapter.example;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.adapterpattern.ClassAdapter.example
 * @className PowerAdapter
 * @date 2019/9/4 14:53
 * @description PowerAdapter电压适配器，将220V电压适配成5V
 */
public class PowerAdapter extends AC220V implements DC5V {

	@Override
	public int output5V() {
		System.out.println("接通220V电源：...");
		int output220V = this.output220V();
		System.out.println("电压转换,降压44倍：...");
		int output5V = output220V / 44;
		return output5V;
	}
}