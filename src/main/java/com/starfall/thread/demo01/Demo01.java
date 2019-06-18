package com.starfall.thread.demo01;

import org.junit.Test;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo01
 * @className Demo01
 * @date 2019/6/11 23:05
 * @description Demo01
 */
public class Demo01 {

	@Test
	public void test01() {
		Thread03 thread03 = new Thread03();
		thread03.start();
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep((int) (Math.random() * 500));
				System.out.println("run = " + Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test02() throws Exception {
		Thread04 thread04 = new Thread04();
		System.out.println("begin == " + thread04.isAlive());
		thread04.start();
		Thread.sleep(100);
		System.out.println("end == " + thread04.isAlive());
	}

	@Test
	public void test03() {
		Thread05 thread05 = new Thread05();
		thread05.start();
	}
}
