package com.starfall.javase.java8.lambda.demo01;

import com.starfall.javase.java8.lambda.Student;

import java.util.Comparator;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.javase.java8.lambda.demo01
 * @className Demo1
 * @date 2019/11/6 18:49
 * @description java8新特性Demo1
 */
public class Demo1 {

	/**
	 * 匿名内部类引入lambda表达式
	 */
	public void test1() {
		// 匿名内部类创建比较器对象
		Comparator<Student> comparator1 = new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return s1.getAge().compareTo(s2.getAge());
			}
		};
		// lambda表达式创建比较器对象
		Comparator<Student> comparator2 = (s1, s2) -> s1.getAge().compareTo(s2.getAge());
	}

	/**
	 * 匿名内部类引入lambda表达式
	 */
	public void test2() {
		// 匿名内部类实现线程
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		});
		thread1.start();

		// lambda表达式实现线程
		Thread thread2 = new Thread(() -> System.out.println(Thread.currentThread().getName()));
		thread2.start();
	}

	public static void main(String[] args) {
		Demo1 demo1 = new Demo1();
		demo1.test2();
	}
}
