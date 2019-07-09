package com.starfall.designpattern.factorymethod;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.factorymethod
 * @className TestClient
 * @date 2019/7/9 17:07
 * @description TestClient 测试客户端
 */
public class TestClient {

	public static void main(String[] args) {
		Product productA = new ConcreteFactoryA().getProduct();
		productA.produce();


	}
}
