package com.starfall.thread.demo08;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo08
 * @className Demo08
 * @date 2019/6/30 10:54
 * @description Demo08
 */
public class Demo08 {

	public void test01() {
		Thread01 thread01 = new Thread01();
		thread01.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " 调用方法thread01.interrupt();");
		thread01.interrupt();
	}

	public void test02() {
		for (int i = 0; i < 10; i++) {
			System.out.println("i == " + i);
			if (i == 5) {
				Thread.currentThread().interrupt();
				break;
			}
		}
		System.out.println("Thread.interrupted()：" + Thread.interrupted());
		System.out.println("Thread.interrupted()：" + Thread.interrupted());
		System.out.println("end");
	}

	public void test03() {
		for (int i = 0; i < 10; i++) {
			System.out.println("i == " + i);
			if (i == 5) {
				Thread.currentThread().interrupt();
				break;
			}
		}
		System.out.println("Thread.currentThread().isInterrupted()：" + Thread.currentThread().isInterrupted());
		System.out.println("Thread.currentThread().isInterrupted()：" + Thread.currentThread().isInterrupted());
		System.out.println("end");
	}

	public void test04() {
		Thread02 thread02 = new Thread02();
		thread02.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " 调用方法thread02.interrupt();");
		thread02.interrupt();
	}

	public void test05() {
		Thread03 thread03 = new Thread03();
		thread03.start();
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " 调用方法thread02.interrupt();");
		thread03.interrupt();

	}

	public static void main(String[] args) {
		Demo08 demo08 = new Demo08();
		demo08.test05();
	}

}
