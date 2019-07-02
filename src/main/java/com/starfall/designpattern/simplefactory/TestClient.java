package com.starfall.designpattern.simplefactory;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.simplefactory
 * @className TestClient
 * @date 2019/7/2 15:45
 * @description TestClient 测试客户端
 */
public class TestClient {
	/**
	 * 测试获取产品角色
	 */
	public void test01() {
		SimpleFactory simpleFactory = new SimpleFactory();
		Product a = simpleFactory.getProduct("A");
		a.produce();
		Product b = simpleFactory.getProduct("B");
		b.produce();
	}

	/**
	 * 测试使用反射获取产品角色
	 */
	public void test02() {
		SimpleFactory simpleFactory = new SimpleFactory();
		Product a = simpleFactory.getProduct(ConcreteProductA.class);
		a.produce();
		Product b = simpleFactory.getProduct(ConcreteProductB.class);
		b.produce();
	}

	public static void main(String[] args) {
		TestClient test = new TestClient();
		test.test01();
		test.test02();
	}
}
