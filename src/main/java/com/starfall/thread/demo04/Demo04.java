package com.starfall.thread.demo04;

import com.starfall.thread.demo03.Demo03;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo04
 * @className Demo04
 * @date 2019/6/16 16:15
 * @description Demo04死锁
 */
public class Demo04 {

	/**
	 * 死锁
	 */
	public void test01() {
		ThreadBean01 bean = new ThreadBean01();
		Thread01 thread1 = new Thread01(bean, "A");
		Thread01 thread2 = new Thread01(bean, "B");
		thread1.start();
		thread2.start();
	}

	public static void main(String[] args) {
		Demo04 demo04 = new Demo04();
		demo04.test01();
	}

}
