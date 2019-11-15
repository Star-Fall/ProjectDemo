package com.starfall.designpattern.flyweightpattern;

import org.junit.Test;

/**
 * @author StarFall
 * @date 2019/11/16 0:03
 * @description 享元模式测试端
 */
public class TestClient {

	@Test
	public void testString() {
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "he" + "llo";
		String s4 = "hel" + new String("lo");
		String s5 = new String("hello");
		String s6 = s5.intern();
		String s7 = "h";
		String s8 = "ello";
		String s9 = s7 + s8;
		System.out.println(s1 == s2);// true
		System.out.println(s1 == s3);// true
		System.out.println(s1 == s4);// false
		System.out.println(s1 == s9);// false
		System.out.println(s4 == s5);// false
		System.out.println(s1 == s6);// true
	}

	public static void main(String[] args) {
		Flyweight flyweight1 = FlyweightFactory.getFlyweight("1");
		flyweight1.operate("2");

		Flyweight flyweight2 = FlyweightFactory.getFlyweight("1");
		flyweight2.operate("ss");

		Flyweight flyweight3 = new UnsharedConcreteFlyweight("3");
		flyweight3.operate("33");
	}
}
