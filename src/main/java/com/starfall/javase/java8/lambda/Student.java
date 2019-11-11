package com.starfall.javase.java8.lambda;

import java.io.Serializable;

/**
 * @author StarFall
 * @date 2019/11/7 22:31
 * @description Student
 */
public class Student implements Serializable {
	private static final long serialVersionUID = -8394342265158867760L;

	private Integer age;
	private String name;

	public Student() {
	}

	public Student(Integer age, String name) {
		this.age = age;
		this.name = name;
	}

	private Student(Builder builder) {
		age = builder.age;
		name = builder.name;
	}

	public static final class Builder {
		private Integer age;
		private String name;

		public Builder() {
		}

		public Builder age(Integer val) {
			age = val;
			return this;
		}

		public Builder name(String val) {
			name = val;
			return this;
		}

		public Student build() {
			return new Student(this);
		}
	}

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
