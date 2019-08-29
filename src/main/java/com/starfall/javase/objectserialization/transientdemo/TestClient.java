package com.starfall.javase.objectserialization.transientdemo;

import java.io.*;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.javase.objectserialization.transientdemo
 * @className TestClient
 * @date 2019/8/29 15:57
 * @description TestClient
 */
public class TestClient {

	public void testObjectOutputStream() {
		Person person = new Person();
		person.setPersonName("personName");
		person.setTransientFiled("transientFiled");
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

	public void testObjectInputStream() {
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
		TestClient test = new TestClient();
		test.testObjectOutputStream();
		test.testObjectInputStream();
	}
}
