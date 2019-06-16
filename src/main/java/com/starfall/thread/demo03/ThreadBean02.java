package com.starfall.thread.demo03;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo03
 * @className ThreadBean02
 * @date 2019/6/15 18:11
 * @description ThreadBean02
 */
public class ThreadBean02 {

	public void serviceMethodA() {
		synchronized (this) {
			try {
				System.out.println("A begin time = " + System.currentTimeMillis());
				Thread.sleep(2000);
				System.out.println("A end time = " + System.currentTimeMillis());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

	public void serviceMethodB() {
		synchronized (this) {
			System.out.println("B begin time = " + System.currentTimeMillis());
			System.out.println("B end time = " + System.currentTimeMillis());
		}
	}
}
