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

	/**
	 * 反射成员方法Method
	 */
	public void test4() {
		try {
			Class class1 = Class.forName("com.starfall.javase.reflect.Person");
			System.out.println("************获取所有公有成员方法************");
			Method[] methods = class1.getMethods();
			for (Method method : methods) {
				System.out.println(method);
			}
			System.out.println("************ 根据方法名和参数获取公有成员方法 ***********");
			Method show5 = class1.getMethod("show5");
			System.out.println(show5);
			System.out.println("************获取所有成员方法************");
			Method[] declaredMethods = class1.getDeclaredMethods();
			for (Method declaredMethod : declaredMethods) {
				System.out.println(declaredMethod);
			}
			System.out.println("************根据方法名和参数获取私有成员方法************");
			Method show2 = class1.getDeclaredMethod("show2", String.class);
			System.out.println(show2);
		} catch (ClassNotFoundException | NoSuchMethodException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Method常用方法
	 */
	public void test4_1() {
		try {
			Class class1 = Class.forName("com.starfall.javase.reflect.Person");
			Method method = class1.getDeclaredMethod("show3", String.class);
			System.out.println(method);
			System.out.println("方法修饰符：" + Modifier.toString(method.getModifiers()));
			System.out.println("方法返回类型：" + method.getReturnType());
			System.out.println("方法名称：" + method.getName());
			System.out.println("方法参数列表：");
			Class<?>[] parameterTypes = method.getParameterTypes();
			for (Class<?> parameterType : parameterTypes) {
				System.out.println(parameterType);
			}
			System.out.println("方法异常列表：");
			Class<?>[] exceptionTypes = method.getExceptionTypes();
			for (Class<?> exceptionType : exceptionTypes) {
				System.out.println(exceptionType);
			}
			// 执行目标方法
			System.out.println("执行目标方法：");
			// 设置允许访问
			method.setAccessible(true);
			// 需要两个参数，一个是要调用的对象（反射创建的对象），一个是实参
			Object invoke = method.invoke(class1.newInstance(), "show3");
			System.out.println(invoke);
		} catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InvocationTargetException
				| InstantiationException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TestClient test = new TestClient();
		test.test4_1();
	}
}