package com.starfall.thread.demo03;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo03
 * @className ThreadBean04
 * @date 2019/6/15 23:21
 * @description ThreadBean04
 */
public class ThreadBean04 {
	public synchronized static void printA() {
		try {
			System.out.println(
					"线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入printA()方法");
			Thread.sleep(1000);
			System.out.println(
					"线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "离开printA()方法");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public synchronized static void printB() {
		System.out.println(
				"线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入printB()方法");
		System.out.println(
				"线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "离开printB()方法");

	}

	public synchronized void printC() {
		System.out.println(
				"线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入printC()方法");
		System.out.println(
				"线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "离开printC()方法");

	}
}
