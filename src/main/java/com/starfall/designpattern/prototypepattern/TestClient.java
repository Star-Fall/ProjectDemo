package com.starfall.designpattern.prototypepattern;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.prototypepattern
 * @className TestClient
 * @date 2019/8/27 17:17
 * @description TestClient 测试端
 */
public class TestClient {
	public static void main(String[] args) {
		ConcretePrototype prototype1 = new ConcretePrototype();
		ConcretePrototype prototype2 = (ConcretePrototype) prototype1.clone();
		System.out.println(prototype1.hashCode());
		System.out.println(prototype2.hashCode());
		System.out.println(prototype1 == prototype2);
		//p2 = p1
		ConcretePrototype p1 = new ConcretePrototype();
		ConcretePrototype p2 = p1;
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(System.identityHashCode(p1));
		System.out.println(System.identityHashCode(p2));
	}
}
