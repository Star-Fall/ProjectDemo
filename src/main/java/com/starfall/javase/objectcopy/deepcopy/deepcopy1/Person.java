package com.starfall.javase.objectcopy.deepcopy.deepcopy1;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.javase.objectcopy.deepcopy.deepcopy1
 * @className Person
 * @date 2019/8/27 14:58
 * @description Person
 */
public class Person implements Cloneable {

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

	@Override
	public Person clone() {
		Person person = null;
		try {
			person = (Person) super.clone();
			person.setJob(person.getJob().clone());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return person;
	}
}
