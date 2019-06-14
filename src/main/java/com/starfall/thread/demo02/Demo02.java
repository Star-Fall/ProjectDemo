package com.starfall.thread.demo02;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo02
 * @className Demo02
 * @date 2019/6/13 10:40
 * @description synchronized同步方法
 */
public class Demo02 {

	public void test01() {
		/*
		 * 同一个线程
		 */
		ThreadBean01 bean01 = new ThreadBean01();
		Thread01 t1 = new Thread01(bean01);
		t1.setName("a");
		Thread01 t2 = new Thread01(bean01);
		t2.setName("b");
		t1.start();
		t2.start();
	}

	public void test02() {
		/*
		 * 两个线程
		 */
		ThreadBean01 bean01 = new ThreadBean01();
		Thread01_1 t1 = new Thread01_1(bean01);
		Thread01_2 t2 = new Thread01_2(bean01);
		t1.start();
		t2.start();
	}

	public void test03() {
		/*
		 * 多个对象多把锁
		 */
		ThreadBean01 bean01 = new ThreadBean01();
		ThreadBean01 bean02 = new ThreadBean01();
		Thread01 t1 = new Thread01(bean01);
		t1.setName("a");
		Thread01 t2 = new Thread01(bean02);
		t2.setName("b");
		t1.start();
		t2.start();

	}

	public void test04() {
		/*
		 * synchronized方法与锁对象
		 */
		ThreadBean02 bean = new ThreadBean02();
		Thread02 t1 = new Thread02(bean);
		t1.setName("A");
		Thread02 t2 = new Thread02(bean);
		t2.setName("B");
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		Demo02 demo = new Demo02();
		demo.test04();
	}
}
