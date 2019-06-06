package com.starfall.thread.demo01;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo01
 * @className Thread02Test
 * @date 2019/6/6 17:40
 * @description todo
 */
public class Thread02Test {

	@Test
	public void test01() {
		Thread02 thread = new Thread02();
		Thread thread1 = new Thread(thread);
		Thread thread2 = new Thread(thread);
		Thread thread3 = new Thread(thread);
		thread1.start();
		thread2.start();
		thread3.start();
	}
}