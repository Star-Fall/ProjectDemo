package com.starfall.designpattern.bridgepattern;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.bridgepattern
 * @className TestClient
 * @date 2019/9/6 17:02
 * @description 测试端
 */
public class TestClient {

	public static void main(String[] args) {
		Implementor implementor = new ConcreteImplementor();
		Abstraction abstraction = new RefinedAbstraction(implementor);
		abstraction.operation();
		((RefinedAbstraction) abstraction).otherOperation();
	}
}
