package com.starfall.thread.demo05;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo05
 * @className Thread02
 * @date 2019/6/17 22:56
 * @description Thread02
 */
public class Thread02 extends Thread {

	public volatile static int count;

	private static void add() {
		for (int i = 0; i < 100; i++) {
			count++;
		}
		System.out.println(Thread.currentThread().getName() + " count=" + count);
	}

	@Override
	public void run() {
		add();
	}
}
