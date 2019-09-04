package com.starfall.designpattern.adapterpattern.ObjectAdapter.example;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.adapterpattern.ObjectAdapter.example
 * @className TestClient
 * @date 2019/9/4 16:01
 * @description 测试端
 */
public class TestClient {

	public static void main(String[] args) {
		AC ac220 = new AC220V();
		DC5V dc = new PowerAdapter(ac220);
		int output5V = dc.output5V();
		System.out.println("最终输出的电压为：" + output5V);

		System.out.println("********************************");

		AC ac110 = new AC110V();
		dc = new PowerAdapter(ac110);
		output5V = dc.output5V();
		System.out.println("最终输出的电压为：" + output5V);
	}
}
