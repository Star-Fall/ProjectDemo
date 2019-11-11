package com.starfall.javase.java8.lambda.demo04;

import com.starfall.javase.java8.lambda.Student;
import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author StarFall
 * @date 2019/11/11 22:57
 * @description 方法引用
 */
public class Demo1 {

	/**
	 * 对象::实例方法
	 */
	@Test
	public void test1() {
		Consumer<String> consumer1 = (s) -> System.out.println(s);
		Consumer<String> consumer2 = System.out::println;

		Supplier<String> supplier1 = () -> "".toString();
		Supplier<String> supplier2 = ""::toString;
	}

	/**
	 * 类::实例方法 <br>
	 * Lambda 的参数列表的第一个参数，是实例方法的调用者，第二个参数(或无参)是实例方法的参数时。
	 */
	@Test
	public void test2() {
		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};
		Comparator<Integer> comparator1 = (i, j) -> i.compareTo(j);
		Comparator<Integer> comparator2 = Integer::compareTo;

		// Function
		Function<Student, Integer> function = new Function<Student, Integer>() {
			@Override
			public Integer apply(Student student) {
				return student.getAge();
			}
		};
		Function<Student, Integer> function1 = (s) -> s.getAge();
		Function<Student, Integer> function2 = Student::getAge;
	}

	/**
	 * 类::静态方法
	 */
	@Test
	public void test3() {
		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return Integer.compare(o1, o2);
			}
		};
		Comparator<Integer> comparator1 = (i, j) -> Integer.compare(i, j);
		Comparator<Integer> comparator2 = Integer::compare;
	}
}
