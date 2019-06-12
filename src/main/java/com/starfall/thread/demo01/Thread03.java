package com.starfall.thread.demo01;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo01
 * @className Thread03
 * @date 2019/6/11 23:06
 * @description Thread的start与run方法
 */
public class Thread03 extends Thread {

	@Override
	public void run() {
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
