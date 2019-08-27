package com.starfall.javase.objectcopy.deepcopy.deepcopy2;

import java.io.*;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.javase.objectcopy.deepcopy.deepcopy2
 * @className Person
 * @date 2019/8/27 15:58
 * @description Person
 */
public class Person implements Serializable {
	private static final long serialVersionUID = -7048054123806521733L;

	private int age;
	private String name;
	private Integer code;
	private Job job;

	public Person() {
	}

	public Person(int age, String name, Integer code, Job job) {
		this.age = age;
		this.name = name;
		this.code = code;
		this.job = job;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Person{" + "age=" + age + ", name='" + name + '\'' + ", code=" + code + ", job=" + job + '}';
	}

	/**
	 * 深度拷贝，使用对象序列化和反序列化
	 * 
	 * @return
	 */
	public Person deepCopy() {
		Person person = null;
		try {
			// 将对象写入流中
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			oos.writeObject(this);
			oos.flush();
			// 将对象取出来
			ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bis);
			person = (Person) ois.readObject();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		return person;
	}
}
