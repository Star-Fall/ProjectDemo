package com.starfall.thread.demo06;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo06
 * @className Demo06
 * @date 2019/6/23 18:05
 * @description Demo06
 */
public class Demo06 {

	public void test01() {
		try {
			Object lock = new Object();
			Thread01_1 thread01_1 = new Thread01_1(lock);
			Thread01_2 thread01_2 = new Thread01_2(lock);
			thread01_1.start();
			Thread.sleep(1000);
			thread01_2.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void test02() {
		Object lock = new Object();
		Thread02_1 thread02_1 = new Thread02_1(lock);
		Thread02_2 thread02_2 = new Thread02_2(lock);
		thread02_1.start();
		thread02_2.start();
	}

	public void test03() {
		Object lock = new Object();
		Thread03_1 mt0 = new Thread03_1(lock);
		mt0.start();
		Thread03_2 mt1 = new Thread03_2(lock);
		mt1.start();
		Thread03_2 mt2 = new Thread03_2(lock);
		mt2.start();
	}

	public void test04() {
		try {
			Object lock = new Object();
			Thread04_1 mt0 = new Thread04_1(lock);
			Thread04_1 mt1 = new Thread04_1(lock);
			Thread04_1 mt2 = new Thread04_1(lock);
			mt0.start();
			mt1.start();
			mt2.start();
			Thread.sleep(1000);
			Thread04_2 mt3 = new Thread04_2(lock);
			mt3.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void test05() {
		Thread05 thread=new Thread05();
		thread.start();
	}

	public static void main(String[] args) throws InterruptedException {
		Demo06 demo06 = new Demo06();
		demo06.test05();
	}
}
