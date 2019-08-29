package com.starfall.javase.objectserialization;

import java.io.Serializable;
import java.util.Date;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.javase.objectserialization
 * @className Person
 * @date 2019/8/29 14:15
 * @description Person
 */
public class Person implements Serializable {

	private static final long serialVersionUID = -4829787339339531853L;
	private String name;
	private int age;
	private Date birthday;
	private static String staticFiled;
	private transient String transientFiled;

	private Job job;

	public Person() {
	}

	public Person(String name, int age, Date birthday, String transientFiled, Job job) {
		this.name = name;
		this.age = age;
		this.birthday = birthday;
		this.transientFiled = transientFiled;
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public static String getStaticFiled() {
		return staticFiled;
	}

	public static void setStaticFiled(String staticFiled) {
		Person.staticFiled = staticFiled;
	}

	public String getTransientFiled() {
		return transientFiled;
	}

	public void setTransientFiled(String transientFiled) {
		this.transientFiled = transientFiled;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Person{" + "name='" + name + '\'' + ", age=" + age + ", birthday=" + birthday + ",staticFiled='"
				+ staticFiled + '\'' + ", transientFiled='" + transientFiled + '\'' + ", job=" + job + '}';
	}
}
