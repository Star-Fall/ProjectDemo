package com.starfall.thread.demo05;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo05
 * @className Demo05
 * @date 2019/6/16 22:49
 * @description Demo05 volatile关键字
 */
public class Demo05 {

	/**
	 * 死循环
	 */
	public void test01() {
		try {
			Thread01 thread01 = new Thread01();
			thread01.start();
			Thread.sleep(1000);
			thread01.setRunning(false);
			System.out.println("已赋值为false");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * volatile非原子性
	 */
	public void test02() {
		ThreadBean03 bean = new ThreadBean03();
		Thread03[] threads = new Thread03[12];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread03(bean);
		}
		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}
	}

	/**
	 * 原子类
	 */
	public void test03() {
		Thread04 thread04 = new Thread04();
		Thread[] threads = new Thread[10];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(thread04);
		}
		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}
	}

	/**
	 *
	 */
	public void test04() {
		try {

			ThreadBean04 bean = new ThreadBean04();
			Thread05 a = new Thread05(bean, "A");
			Thread05 b = new Thread05(bean, "B");
			a.start();
			Thread.sleep(1000);
			b.start();
			System.out.println("已经发起停止命令！");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Demo05 demo05 = new Demo05();
		demo05.test04();
	}
}
