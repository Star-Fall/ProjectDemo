package com.starfall.javase.reflect;

import java.lang.reflect.*;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.javase.reflect
 * @className TestClient
 * @date 2019/8/30 14:28
 * @description TestClient 测试
 */
public class TestClient {

	public void test1() {
		try {
			// 获取Class对象
			Class class1 = Class.forName("com.starfall.javase.reflect.Person");
			// 使用反射创建实例对象
			// 使用Class对象
			Person p1 = (Person) class1.newInstance();
			// 使用构造器对象
			Constructor constructor = class1.getConstructor();
			Person p2 = (Person) constructor.newInstance();
		} catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 获取反射构造器Constructor
	 */
	public void test2() {
		try {
			Class class1 = Class.forName("com.starfall.javase.reflect.Person");
			// 获取所有公有构造方法
			System.out.println("************获取所有公有构造方法************");
			Constructor[] constructors = class1.getConstructors();
			for (Constructor constructor : constructors) {
				System.out.println(constructor);
			}
			System.out.println("************根据参数获取构造方法(public)************");
			Constructor constructor = class1.getConstructor(String.class);
			System.out.println(constructor);
			// 获取所有构造方法
			System.out.println("************获取所有构造方法************");
			Constructor[] declaredConstructors = class1.getDeclaredConstructors();
			for (Constructor declaredConstructor : declaredConstructors) {
				System.out.println(declaredConstructor);
			}
			System.out.println("************根据参数获取构造方法(private)************");
			Constructor declaredConstructor = class1.getDeclaredConstructor(Integer.class);
			System.out.println(declaredConstructor);
		} catch (ClassNotFoundException | NoSuchMethodException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Constructor常用方法
	 */
	public void test2_1() {
		try {
			Class class1 = Class.forName("com.starfall.javase.reflect.Person");
			// 私有构造： Constructor constructor = class1.getDeclaredConstructor(Integer.class);
			Constructor constructor = class1.getConstructor(Integer.class, String.class);
			System.out.println("修饰符：" + Modifier.toString(constructor.getModifiers()));
			System.out.println("构造器名称：" + constructor.getName());
			System.out.println("构造器参数类型列表：");
			Class[] parameterTypes = constructor.getParameterTypes();
			for (Class parameterType : parameterTypes) {
				System.out.println(parameterType);
			}
			System.out.println("构造器参数列表：");
			Parameter[] parameters = constructor.getParameters();
			for (Parameter parameter : parameters) {
				System.out.println(parameter);
			}
			System.out.println("忽略掉访问修饰符：" + constructor.isAccessible());
			System.out.println("构造器生成实例对象");
			Object o = constructor.newInstance(1, "A");
		} catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 反射成员变量Field
	 */
	public void test3() {
		try {
			Class class1 = Class.forName("com.starfall.javase.reflect.Person");
			System.out.println("************获取所有公有成员变量************");
			Field[] fields = class1.getFields();
			for (Field field : fields) {
				System.out.println(field);
			}
			System.out.println("************根据成员变量名称获取成员变量************");
			Field age = class1.getDeclaredField("age");
			System.out.println(age);
			System.out.println("************获取所有成员变量************");
			Field[] declaredFields = class1.getDeclaredFields();
			for (Field declaredField : declaredFields) {
				System.out.println(declaredField);
			}
		} catch (ClassNotFoundException | NoSuchFieldException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Field常用方法
	 */
	public void test3_1() {
		try {
			Class class1 = Class.forName("com.starfall.javase.reflect.Person");
			Field name = class1.getDeclaredField("name");
			System.out.println("修饰符：" + Modifier.toString(name.getModifiers()));
			System.out.println("变量名称：" + name.getName());
			System.out.println("变量类型：" + name.getType());

			// 为实例对象设置字段值
			Person person = (Person) class1.newInstance();
			System.out.println("设置私有变量可以访问，并赋值：");
			// 私有变量设置允许访问
			name.setAccessible(true);
			name.set(person, "personName");
			System.out.println("获取修改后的属性值：" + name.get(person));
			System.out.println(person);
		} catch (ClassNotFoundException | NoSuchFieldException | IllegalAccessException | InstantiationException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TestClient test = new TestClient();
		test.test3_1();
	}
}