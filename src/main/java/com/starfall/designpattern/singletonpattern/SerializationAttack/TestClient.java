package com.starfall.designpattern.singletonpattern.SerializationAttack;

import java.io.*;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.singletonpattern.SerializationAttack
 * @className TestClient
 * @date 2019/8/29 17:39
 * @description TestClient
 */
public class TestClient {

	/**
	 * 测试序列化攻击单例
	 */
	public void test1() {
		HungrySingleton singleton = HungrySingleton.getInstance();
		HungrySingleton singleton2 = null;

		try {
			// 序列化对象
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("HungrySingleton"));
			oos.writeObject(singleton);
			oos.close();

			// 反序列化对象
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("HungrySingleton"));
			singleton2 = (HungrySingleton) ois.readObject();
			ois.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(singleton.hashCode());
		System.out.println(singleton2.hashCode());
	}

/**
 * 测试序列化攻击单例-解决方案
 */
public void test2() {
	HungrySingletonSafe singleton = HungrySingletonSafe.getInstance();
	HungrySingletonSafe singleton2 = null;

	try {
		// 序列化对象
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("HungrySingletonSafe"));
		oos.writeObject(singleton);
		oos.close();

		// 反序列化对象
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("HungrySingletonSafe"));
		singleton2 = (HungrySingletonSafe) ois.readObject();
		ois.close();
	} catch (IOException | ClassNotFoundException e) {
		e.printStackTrace();
	}
	System.out.println(singleton.hashCode());
	System.out.println(singleton2.hashCode());
}

	public static void main(String[] args) {
		TestClient testClient = new TestClient();
		// testClient.test1();
		testClient.test2();
	}
}
