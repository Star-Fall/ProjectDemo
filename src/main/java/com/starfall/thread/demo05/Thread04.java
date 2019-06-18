package com.starfall.thread.demo05;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo05
 * @className Thread04
 * @date 2019/6/17 23:43
 * @description Thread04
 */
public class Thread04 extends Thread {

	private AtomicInteger count = new AtomicInteger(0);

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(count.incrementAndGet());
		}
	}
}
