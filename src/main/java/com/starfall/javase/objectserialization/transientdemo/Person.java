package com.starfall.javase.objectserialization.transientdemo;

import java.io.Serializable;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.javase.objectserialization.staticdemo
 * @className Person
 * @date 2019/8/29 15:37
 * @description Person
 */
public class Person implements Serializable {
	private static final long serialVersionUID = -4744007072703671987L;
	private String personName;
	private transient String transientFiled;

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getTransientFiled() {
		return transientFiled;
	}

	public void setTransientFiled(String transientFiled) {
		this.transientFiled = transientFiled;
	}

	@Override
	public String toString() {
		return "Person{" + "personName='" + personName + '\'' + ", transientFiled='" + transientFiled + '\'' + '}';
	}
}
