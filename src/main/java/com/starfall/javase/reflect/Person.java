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

	public String field;

	public Person() {
		System.out.println("默认无参构造方法");
	}

	public Person(String name) {
		System.out.println("有参构造方法：String name");
		this.name = name;
	}

	public Person(Integer code, String name) {
		System.out.println("有参构造方法：Integer code, String name");
		this.code = code;
		this.name = name;
	}

	public Person(int age, Integer code, String name, Date birthday) {
		System.out.println("有参构造方法：int age, Integer code, String name, Date birthday");
		this.age = age;
		this.code = code;
		this.name = name;
		this.birthday = birthday;
	}

	public Person(int age, Integer code, String name, Date birthday, String field) {
		System.out.println("有参构造方法：int age, Integer code, String name, Date birthday, String field");
		this.age = age;
		this.code = code;
		this.name = name;
		this.birthday = birthday;
		this.field = field;
	}

	protected Person(int age) {
		System.out.println("受保护有参构造方法：int age");
		this.age = age;
	}

	private Person(Integer code) {
		System.out.println("私有有参构造方法：Integer code");
		this.code = code;
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

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	@Override
	public String toString() {
		return "Person{" +
				"age=" + age +
				", code=" + code +
				", name='" + name + '\'' +
				", birthday=" + birthday +
				", field='" + field + '\'' +
				'}';
	}
}
