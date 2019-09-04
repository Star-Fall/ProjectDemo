package com.starfall.designpattern.adapterpattern.ClassAdapter.example;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.adapterpattern.ClassAdapter.example
 * @className TestClient
 * @date 2019/9/4 14:56
 * @description 测试电压适配器
 */
public class TestClient {

	public static void main(String[] args) {
		DC5V dc5V = new PowerAdapter();
		int output5V = dc5V.output5V();
		System.out.println("最终输出的电压为：" + output5V);
	}
}