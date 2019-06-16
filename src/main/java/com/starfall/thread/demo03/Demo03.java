package com.starfall.thread.demo03;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo03
 * @className Demo03
 * @date 2019/6/15 17:44
 * @description synchronized同步代码块
 */
public class Demo03 {

	/**
	 * 同步代码块
	 */
	public void test01() {
		ThreadBean01 bean = new ThreadBean01();
		Thread01 thread1 = new Thread01(bean, "A");
		Thread01 thread2 = new Thread01(bean, "B");
		thread1.start();
		thread2.start();
	}

	/**
	 * synchronized互斥性
	 */
	public void test02() {
		ThreadBean02 bean = new ThreadBean02();
		Thread02 thread1 = new Thread02(bean, "A");
		Thread02 thread2 = new Thread02(bean, "B");
		thread1.start();
		thread2.start();
	}

	/**
	 * synchronized(非this对象)
	 */
	public void test03() {
		ThreadBean03 bean = new ThreadBean03();
		Thread03 thread1 = new Thread03(bean, "A");
		Thread03 thread2 = new Thread03(bean, "B");
		thread1.start();
		thread2.start();
	}

	/**
	 * synchronized同步静态方法
	 */
	public void test04() {
		ThreadBean04 bean = new ThreadBean04();
		Thread04 thread1 = new Thread04(bean, "A");
		Thread04 thread2 = new Thread04(bean, "B");
		Thread04 thread3 = new Thread04(bean, "C");
		thread1.start();
		thread2.start();
		thread3.start();
	}

	public void test05() {
		ThreadBean05 bean = new ThreadBean05();
		Thread05 thread1 = new Thread05(bean, "A");
		Thread05 thread2 = new Thread05(bean, "B");
		thread1.start();
		thread2.start();
	}

	public static void main(String[] args) {
		Demo03 demo03 = new Demo03();
		demo03.test05();
	}
}