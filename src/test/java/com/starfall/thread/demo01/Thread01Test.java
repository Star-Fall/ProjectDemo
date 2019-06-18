package com.starfall.thread.demo01;

import org.junit.Test;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo01
 * @className Thread01Test
 * @date 2019/6/6 17:33
 * @description Thread01Test
 */
public class Thread01Test {

	@Test
	public void test01() {
		Thread01 thread01 = new Thread01();
		Thread01 thread02 = new Thread01();
		Thread01 thread03 = new Thread01();
		// 启动3个线程t1,t2,t3；每个线程各卖10张票！
		thread01.start();
		thread02.start();
		thread03.start();
	}

}