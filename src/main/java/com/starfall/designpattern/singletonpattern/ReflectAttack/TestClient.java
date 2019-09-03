package com.starfall.designpattern.singletonpattern.ReflectAttack;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.singletonpattern.ReflectAttack
 * @className TestClient
 * @date 2019/9/3 15:30
 * @description 反射攻击测试
 */
public class TestClient {
	/**
	 * 反射攻击饿汉式
	 */
	public void test1() {
		HungrySingleton singleton = HungrySingleton.getInstance();
		HungrySingleton singleton1 = null;
		HungrySingleton singleton2 = null;
		try {
			// 获取Class对象
			Class<HungrySingleton> clazz = HungrySingleton.class;
			// 获取私有构造器
			Constructor<HungrySingleton> declaredConstructor = clazz.getDeclaredConstructor();
			// 设置私有构造器可访问
			declaredConstructor.setAccessible(true);
			// 使用私有构造器创建实例对象
			singleton1 = declaredConstructor.newInstance();
			singleton2 = declaredConstructor.newInstance();
		} catch (NoSuchMethodException | InstantiationException | IllegalAccessException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
		System.out.println(singleton.hashCode());
		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode());
	}

	/**
	 * 反射攻击解决方法
	 */
	public void test2() {
		HungrySingletonSafe singletonSafe = HungrySingletonSafe.getInstance();
		HungrySingletonSafe singletonSafe1 = null;
		try {
			// 获取Class对象
			Class<HungrySingletonSafe> clazz = HungrySingletonSafe.class;
			// 获取私有构造器
			Constructor<HungrySingletonSafe> declaredConstructor = clazz.getDeclaredConstructor();
			// 设置私有构造器可访问
			declaredConstructor.setAccessible(true);
			// 使用私有构造器创建实例对象
			singletonSafe1 = declaredConstructor.newInstance();
		} catch (NoSuchMethodException | InstantiationException | IllegalAccessException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
		System.out.println(singletonSafe.hashCode());
		System.out.println(singletonSafe1.hashCode());
	}

	/**
	 * 测试枚举抵御反射攻击
	 */
	public void test3() {
		SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
		SingletonEnum singletonEnum1 = null;
		try {
			// 获取Class对象
			Class<SingletonEnum> clazz = SingletonEnum.class;
			Constructor<SingletonEnum> constructor = (Constructor<SingletonEnum>) clazz.getDeclaredConstructors()[0];
			constructor.setAccessible(true);
			singletonEnum1 = constructor.newInstance();
		} catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TestClient testClient = new TestClient();
		// testClient.test1();
		// testClient.test2();
		testClient.test3();
	}
}
