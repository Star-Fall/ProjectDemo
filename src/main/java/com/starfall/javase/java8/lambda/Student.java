package com.starfall.javase.java8.lambda;

import java.io.Serializable;

/**
 * @author StarFall
 * @date 2019/11/7 22:31
 * @description TODO
 */
public class Student implements Serializable {
	private static final long serialVersionUID = -8394342265158867760L;

	private Integer age;
	private String name;

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student{" + "age=" + age + ", name='" + name + '\'' + '}';
	}
}
