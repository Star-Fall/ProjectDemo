package com.starfall.designpattern.ChainofResponsibilityPattern.single;

/**
 * @author StarFall
 * @date 2019/11/24 20:11
 * @description 职责链模式测试端——纯的职责链模式
 */
public class TestClient {

	public static void main(String[] args) {
		Handler concreteHandler1 = new ConcreteHandler1();
		Handler concreteHandler2 = new ConcreteHandler2();
		concreteHandler1.setNextHandler(concreteHandler2);

		int[] requests = new int[] { 10, 20, 110 };
		for (int request : requests) {
			System.out.println("-----------------参数：" + request + "-----------------");
			concreteHandler1.handler(request);
		}
	}
}