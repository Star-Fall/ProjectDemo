package com.starfall.thread.demo06;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo06
 * @className Thread02_1
 * @date 2019/6/25 23:21
 * @description Thread02_1
 */
public class Thread02_1 extends Thread {
	private Object lock;

	public Thread02_1(Object lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		try {
			synchronized (lock) {
				System.out.println(Thread.currentThread().getName() + " Begin wait()");
				lock.wait();
				System.out.println(Thread.currentThread().getName() + " End wait");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
