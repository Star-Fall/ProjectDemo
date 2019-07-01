package com.starfall.thread.demo09;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo09
 * @className Thread02B
 * @date 2019/7/1 22:59
 * @description Thread02B
 */
public class Thread02B extends Thread {
	public void run() {
		try {
			Thread02A thread02A = new Thread02A();
			thread02A.start();
			thread02A.join();
			System.out.println(Thread.currentThread().getName() + " end");
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() + " catch InterruptedException");
			e.printStackTrace();
		}

	}
}
