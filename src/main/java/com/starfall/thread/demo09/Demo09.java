package com.starfall.thread.demo09;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo09
 * @className Demo09
 * @date 2019/7/1 22:37
 * @description Demo09
 */
public class Demo09 {

	public void test01() {
		try {
			Thread01 thread01 = new Thread01();
			thread01.start();
			thread01.join();
			System.out.println(Thread.currentThread().getName() + " end!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void test02() {
		Thread02B thread02B = new Thread02B();
		thread02B.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread02B.interrupt();
	}

	public void test03() {
		try {
			Thread03 thread03 = new Thread03();
			thread03.start();
			thread03.join(2000);
			System.out.println(Thread.currentThread().getName() + " end time:" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Demo09 demo09 = new Demo09();
		demo09.test03();
	}


}
