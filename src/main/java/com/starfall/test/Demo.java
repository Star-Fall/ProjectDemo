package com.starfall.test;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.test
 * @className Demo01
 * @date 2019/7/14 21:10
 * @description Demo
 */
public class Demo {
	private String str = "str";
	private static String static_str = "static_str";

	{
		System.out.println("{}: " + str);
		System.out.println("{}: " + static_str);
		method();
		methodStatic();
	}
	static {
		// System.out.println("static{}: " + str);
		System.out.println("static{}: " + static_str);
		// method();
		methodStatic();
	}

	private void method() {
		System.out.println(str);
		System.out.println(static_str);
		method();
		methodStatic();
	}

	private static void methodStatic() {
		System.out.println(static_str);
		// System.out.println(str);
		// method();
		methodStatic();
	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.method();
		methodStatic();
	}
}