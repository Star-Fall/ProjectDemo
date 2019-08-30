package com.starfall.javase.reflect;

import java.lang.reflect.Constructor;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.javase.reflect
 * @className TestClient
 * @date 2019/8/30 14:28
 * @description todo
 */
public class TestClient {

	public void test1() {
		try {
			// 获取Class对象
			Class class1 = Class.forName("com.starfall.javase.reflect.Person");
			Person person = (Person) class1.newInstance();
			Constructor[] constructors = class1.getConstructors();
			for (Constructor constructor : constructors) {
				System.out.println(constructor.toString());
			}
		} catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TestClient test = new TestClient();
		test.test1();
	}
}
