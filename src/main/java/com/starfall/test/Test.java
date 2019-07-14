package com.starfall.test;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.test
 * @className Test
 * @date 2019/7/14 23:25
 * @description Test
 */
public class Test {

	Person person = new Person("Test");

	static {
		System.out.println("test static");
	}

	public Test() {
		System.out.println("test constructor");
	}

	public static void main(String[] args) {
		new MyClass();
	}
}

class Person {

	static {
		System.out.println("person static");
	}

	public Person(String str) {
		System.out.println("person " + str);
	}
}

class MyClass extends Test {

	Person person = new Person("MyClass");

	static {
		System.out.println("myclass static");
	}

	public MyClass() {
		System.out.println("myclass constructor");
	}
}