package com.starfall.thread.demo12;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo12
 * @className Thread01
 * @date 2019/7/7 22:09
 * @description Thread01
 */
public class Thread01 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " getPriority " + this.getPriority());
		}
	}
}
