package com.starfall.javase.objectserialization;

import java.io.*;
import java.util.Date;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.javase.objectserialization
 * @className TestClient
 * @date 2019/8/29 14:21
 * @description TestClient
 */
public class TestClient {

	public void test1() {
		Job job = new Job("personJob", 10000.12);
		Person person = new Person("personName", 12, new Date(), "transientFiled", job);
		person.setStaticFiled("staticFileds");
		System.out.println(person);
		// 序列化对象
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person"));
			oos.writeObject(person);
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void test2() {
		// 反序列化对象
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person"));
			Person person = (Person) ois.readObject();
			System.out.println(person);
			ois.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TestClient testClient = new TestClient();
		testClient.test1();
		testClient.test2();
	}
}
