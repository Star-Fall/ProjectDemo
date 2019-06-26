package com.starfall.thread.demo06;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo06
 * @className Thread04_1
 * @date 2019/6/26 21:24
 * @description Thread04_1
 */
public class Thread04_1 extends Thread {

	private Object lock;

	public Thread04_1(Object lock) {
		this.lock = lock;
	}

	public void run() {
		ThreadDomain01 td = new ThreadDomain01();
		td.testMethod(lock);
	}
}
