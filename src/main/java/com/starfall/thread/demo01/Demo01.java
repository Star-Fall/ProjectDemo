package com.starfall.thread.demo01;

import org.junit.Test;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo01
 * @className Demo01
 * @date 2019/6/11 23:05
 * @description todo
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
}
