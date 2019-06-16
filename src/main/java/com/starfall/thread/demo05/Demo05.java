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

	public static void main(String[] args) {
		Demo05 demo05 = new Demo05();
		demo05.test01();
	}
}
