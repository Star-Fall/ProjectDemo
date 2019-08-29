package com.starfall.javase.objectserialization.serialVersionUID;

import java.io.Serializable;
import java.util.Date;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.javase.objectserialization.serialVersionUID
 * @className Person
 * @date 2019/8/29 16:32
 * @description Person
 */
public class Person implements Serializable {

	private static final long serialVersionUID = -3912246504616520928L;
	private String name;
	private int age;
	private Date birthday;

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

	@Override
	public String toString() {
		return "Person{" + "name='" + name + '\'' + ", age=" + age + ", birthday=" + birthday + '}';
	}

	// @Override
	// public String toString() {
	// return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
	// }
}
