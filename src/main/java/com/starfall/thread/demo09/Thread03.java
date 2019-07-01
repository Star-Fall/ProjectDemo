package com.starfall.thread.demo09;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo09
 * @className Thread03
 * @date 2019/7/1 23:29
 * @description Thread03
 */
public class Thread03 extends Thread {
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " begin time:" + System.currentTimeMillis());
			Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + " end time:" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
