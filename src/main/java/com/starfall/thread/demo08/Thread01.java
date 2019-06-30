package com.starfall.thread.demo08;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo08
 * @className Thread01
 * @date 2019/6/30 16:10
 * @description Thread01
 */
public class Thread01 extends Thread {

	public void run() {
		for (int i = 0; i < 100000; i++) {
			if (this.isInterrupted()) {
				return;
			}
			System.out.println("i = " + i);
		}
		System.out.println(this.getName() + " 已经被中断!");
	}
}
