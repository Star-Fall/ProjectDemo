package com.starfall.javase.java8.lambda.demo02;

import com.starfall.javase.java8.lambda.Student;
import org.junit.Test;

/**
 * @author StarFall
 * @date 2019/11/9 10:21
 * @description lambda语法格式
 */
public class Demo1 {

	/**
	 * 1.无参无返回值
	 */
	@Test
	public void test1() {
		// 匿名内部类形式
		MyFunction1 function1 = new MyFunction1() {
			@Override
			public void test() {
				System.out.println("匿名内部类");
			}
		};
		function1.test();
		// 单行代码
		MyFunction1 function2 = () -> System.out.println("函数式接口无参无返回值，lambda");
		function2.test();
		// 多行代码
		MyFunction1 function3 = () -> {
			System.out.println("lambda多行代码");
			System.out.println("lambda多行代码");
		};
		function3.test();
	}

	/**
	 * 有参，无返回值
	 */
	@Test
	public void test2() {
		Student student = new Student.Builder().age(20).name("Tom").build();
		// 匿名内部类形式
		MyFunction2 function1 = new MyFunction2() {
			@Override
			public void test(Student student) {
				System.out.println("匿名内部类形式：" + student.toString());
			}
		};
		function1.test(student);

		// lambda表达式
		MyFunction2 function2 = (Student s) -> System.out.println("lambda表达式形式：" + s.toString());
		function2.test(student);
	}

	/**
	 * 有返回值
	 */
	@Test
	public void test3() {
		Student student = new Student.Builder().age(20).name("Tom").build();
		// 匿名内部类形式
		MyFunction3 function1 = new MyFunction3() {
			@Override
			public boolean test(Student student) {
				return student.getAge().equals(20);
			}
		};
		System.out.println(function1.test(student));
		// lambda表达式
		MyFunction3 function2 = (Student s) -> {
			return s.getAge().equals(20);
		};
		System.out.println(function2.test(student));

		// 省略return和{}
		MyFunction3 function3 = s -> s.getAge().equals(20);
	}

	public static void main(String[] args) {
		Demo1 demo1 = new Demo1();
	}
}
