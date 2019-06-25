package com.starfall.thread.demo06;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo06
 * @className Thread01_2
 * @date 2019/6/25 21:23
 * @description Thread01_2
 */
public class Thread01_2 extends Thread {
	private Object lock;

	public Thread01_2(Object lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		synchronized (lock) {
			System.out.println("开始------notify time = " + System.currentTimeMillis());
			lock.notify();
			System.out.println("结束------notify time = " + System.currentTimeMillis());
		}
	}
}
