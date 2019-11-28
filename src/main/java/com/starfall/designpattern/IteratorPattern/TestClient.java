package com.starfall.designpattern.IteratorPattern;

/**
 * @author StarFall
 * @date 2019/11/28 22:49
 * @description 迭代器模式——测试端
 */
public class TestClient {
	public static void main(String[] args) {
		ConcreteAggregate<String> aggregate = new ConcreteAggregate<>();
		aggregate.add("a");
		aggregate.add("b");
		aggregate.add("c");
		aggregate.add("d");
		aggregate.add("e");

		Iterator<String> iterator = aggregate.iterator();
		while (iterator.hasNext()) {
			String value = iterator.next();
			System.out.println(value);
		}
	}
}