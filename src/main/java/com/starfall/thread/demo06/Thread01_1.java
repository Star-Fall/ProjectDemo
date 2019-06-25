package com.starfall.thread.demo06;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo06
 * @className Thread01_1
 * @date 2019/6/25 21:22
 * @description Thread01_1
 */
public class Thread01_1 extends Thread {

	private Object lock;

	public Thread01_1(Object lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		try {
			synchronized (lock) {
				System.out.println("开始------wait time = " + System.currentTimeMillis());
				lock.wait();
				System.out.println("结束------wait time = " + System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
