package com.starfall.javase.objectserialization.staticdemo;

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
	private static final long serialVersionUID = -8584988875522134855L;
	private String personName;
	private static String staticField;

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public static String getStaticField() {
		return staticField;
	}

	public static void setStaticField(String staticField) {
		Person.staticField = staticField;
	}

	@Override
	public String toString() {
		return "Person{" + "personName='" + personName + '\'' + "staticField='" + staticField + '\'' + '}';
	}
}
