package com.starfall.javase.objectserialization.serialVersionUID;

import java.io.*;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.javase.objectserialization.serialVersionUID
 * @className TestClient
 * @date 2019/8/29 16:33
 * @description TestClient
 */
public class TestClient {

	public void test1() {
		Person person = new Person();
		person.setName("PersonName");
		person.setAge(11);
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
			Person person2 = (Person) ois.readObject();
			System.out.println(person2);
			ois.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TestClient testClient = new TestClient();
		// testClient.test1();
		testClient.test2();
	}
}
