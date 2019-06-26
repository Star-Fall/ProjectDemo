package com.starfall.thread.demo06;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo06
 * @className Thread04_1
 * @date 2019/6/26 21:24
 * @description Thread04_1
 */
public class Thread04_2 extends Thread {

	private Object lock;

	public Thread04_2(Object lock) {
		this.lock = lock;
	}

	public void run() {
		synchronized (lock) {
			System.out.println(Thread.currentThread().getName() + " notifyAll start");
			lock.notifyAll();
			System.out.println(Thread.currentThread().getName() + " notifyAll end");
		}
	}
}
