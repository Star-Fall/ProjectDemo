package com.starfall.javase.java8.lambda.demo04;

import com.starfall.javase.java8.lambda.Student;
import org.junit.Test;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author StarFall
 * @date 2019/11/12 0:28
 * @description 构造引用
 */
public class Demo2 {

	/**
	 * 构造器引用
	 */
	@Test
	public void test1() {
		// 无参构造
		Supplier<Student> supplier = new Supplier<Student>() {
			@Override
			public Student get() {
				return new Student();
			}
		};
		Supplier<Student> supplier1 = () -> new Student();
		Supplier<Student> supplier2 = Student::new;

		// 有参构造
		BiFunction<Integer, String, Student> biFunction = new BiFunction<Integer, String, Student>() {
			@Override
			public Student apply(Integer age, String name) {
				return new Student(age, name);
			}
		};
		BiFunction<Integer, String, Student> biFunction1 = (age, name) -> new Student(age, name);
		BiFunction<Integer, String, Student> biFunction2 = Student::new;
	}

	/**
	 * 数组引用
	 */
	@Test
	public void test2() {
		Function<Integer, String[]> function = new Function<Integer, String[]>() {
			@Override
			public String[] apply(Integer length) {
				return new String[length];
			}
		};
		Function<Integer, String[]> function1 = (length) -> new String[length];
		Function<Integer, String[]> function2 = String[]::new;
	}
}
