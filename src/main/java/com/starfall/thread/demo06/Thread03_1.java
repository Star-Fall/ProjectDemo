package com.starfall.thread.demo06;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo06
 * @className Thread03_1
 * @date 2019/6/25 23:37
 * @description Thread03_1
 */
public class Thread03_1 extends Thread {
	private Object lock;

	public Thread03_1(Object lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		ThreadDomain td = new ThreadDomain();
		td.testMethod(lock);
	}
}
