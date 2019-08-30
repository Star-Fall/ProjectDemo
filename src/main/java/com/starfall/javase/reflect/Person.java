package com.starfall.javase.reflect;

import java.util.Date;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.javase.reflect
 * @className Person
 * @date 2019/8/30 15:23
 * @description Person
 */
public class Person {

	private int age;
	private Integer code;
	private String name;
	private Date birthday;
	private static String STR = "STR";

	public Person() {
	}

	public Person(int age, Integer code, String name, Date birthday) {
		this.age = age;
		this.code = code;
		this.name = name;
		this.birthday = birthday;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public static String getSTR() {
		return STR;
	}

	public static void setSTR(String STR) {
		Person.STR = STR;
	}

	@Override
	public String toString() {
		return "Person{" + "age=" + age + ", code=" + code + ", name='" + name + '\'' + ", birthday=" + birthday + '}';
	}
}
