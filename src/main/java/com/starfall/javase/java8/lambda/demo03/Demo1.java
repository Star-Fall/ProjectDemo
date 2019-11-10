package com.starfall.javase.java8.lambda.demo03;

import com.starfall.javase.java8.lambda.Student;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author StarFall
 * @date 2019/11/10 0:37
 * @description 函数式接口
 */
public class Demo1 {

	/**
	 * Consumer<T>接口
	 */
	@Test
	public void test1() {
		Student student = new Student.Builder().age(12).name("Jerry").build();
		// 匿名内部类形式
		Consumer<String> consumer = new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s + s);
			}
		};
		consumer.accept("消费者接口");

		// lambda表达式形式
		Consumer<Student> consumer1 = s -> System.out.println(s.toString());
		consumer1.accept(student);
	}

	/**
	 * Consumer<T>接口andThen方法
	 */
	@Test
	public void test1_0() {
		Consumer<String> consumer1 = (s) -> System.out.println("consumer1：" + s);
		Consumer<String> consumer2 = (s) -> System.out.println("consumer2：" + s);
		Consumer<String> consumer3 = (s) -> System.out.println("consumer3：" + s);
		consumer3.andThen(consumer2).andThen(consumer1).accept("参数String");
	}

	/**
	 * Consumer<T>接口应用
	 */
	@Test
	public void test1_1() {
		List<String> list = Arrays.asList("1", "2", "3", "4");
		// 调用方式1：匿名内部类
		list.forEach(new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		});
		// 调用方式2：lambda表达式
		list.forEach((str) -> System.out.println(str));

		// 使用andThen
		Consumer<String> consumer = (s) -> System.out.print(s);
		consumer = consumer.andThen((s) -> System.out.println("(print " + s + ")"));
		list.forEach(consumer);
	}

	/**
	 * BiConsumer<T, U>应用
	 */
	@Test
	public void test1_2() {
		Map<String, Object> map = new HashMap<>();
		map.put("k1", "v1");
		map.put("k2", "v2");
		map.put("k3", "v3");

		map.forEach((k, v) -> {
			System.out.println("key：" + k + "，value：" + v);
		});
	}

	/**
	 * Predicate<T>接口
	 */
	@Test
	public void test2() {
		Student student = new Student.Builder().age(12).name("Jerry").build();
		// 匿名内部类
		Predicate<Student> predicate1 = new Predicate<Student>() {
			@Override
			public boolean test(Student s) {
				return s.getAge().equals(12);
			}
		};
		System.out.println(predicate1.test(student));

		// lambda表达式
		Predicate<Student> predicate2 = (s) -> s.getAge().equals(20);
		System.out.println(predicate2.test(student));
	}

	/**
	 * Predicate<T>非抽象方法
	 */
	@Test
	public void test2_0() {
		Student student = new Student.Builder().age(12).name("Jerry").build();
		// 定义两种test规则
		Predicate<Student> predicate1 = (s) -> s.getAge().equals(12);
		Predicate<Student> predicate2 = (s) -> s.getName().equals("Tom");

		// and方法
		System.out.println(predicate1.and(predicate2).test(student));
		// negate
		System.out.println(predicate2.negate().test(student));
		// or
		System.out.println(predicate1.or(predicate2).test(student));
		// isEqual
		System.out.println(Predicate.isEqual(new Object()).test(student));
	}

	/**
	 * Supplier<T>接口
	 */
	@Test
	public void test3() {
		// 匿名表达式形式
		Supplier<Student> supplier1 = new Supplier<Student>() {
			@Override
			public Student get() {
				return new Student.Builder().age(1).build();
			}
		};
		System.out.println(supplier1.get());

		// lambda表达式形式
		Supplier<Student> supplier2 = () -> new Student.Builder().age(12).name("Marry").build();
		System.out.println(supplier2.get());
	}

	/**
	 * Function<T, R>接口 根据年龄创建Student对象
	 */
	@Test
	public void test4() {
		// 匿名内部类形式
		Function<Integer, Student> function1 = new Function<Integer, Student>() {
			@Override
			public Student apply(Integer integer) {
				return new Student.Builder().age(integer).build();
			}
		};
		System.out.println(function1.apply(1));

		// lambda表达式
		Function<Integer, Student> function2 = (age) -> new Student.Builder().age(age).build();
		System.out.println(function2.apply(2));
	}

	/**
	 * Function<T, R>接口非抽象方法
	 */
	@Test
	public void test4_0() {
		Function<String, Student> function1 = (name) -> {
			System.out.println("执行function1，入参为：" + name);
			return new Student.Builder().age(name.length()).name(name).build();
		};
		Function<String, String> function2 = (name) -> {
			System.out.println("执行function2，入参为：" + name);
			return name;
		};
		// compose：function2的返回值必须是function1的入参
		Student student1 = function1.compose(function2).apply("compose");
		System.out.println(student1);
		// andThen：function2的返回值必须是function1的入参，与compose相比function1和function2位置调换
		Student student2 = function2.andThen(function1).apply("andThen");
		System.out.println(student2);
		// identity：产生一个Function对象
		Function<String, String> function3 = Function.identity();
		System.out.println(function3.apply("function3"));
	}

}
