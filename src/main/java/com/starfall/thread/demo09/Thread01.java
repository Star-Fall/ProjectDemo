package com.starfall.thread.demo09;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo09
 * @className Thread01
 * @date 2019/7/1 22:39
 * @description Thread01
 */
public class Thread01 extends Thread {

	public void run() {
		try {
			int seconds = (int) (Math.random() * 10000);
			System.out.println(Thread.currentThread().getName() + " sleep " + seconds);
			Thread.sleep(seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
