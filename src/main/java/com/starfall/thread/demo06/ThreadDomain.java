package com.starfall.thread.demo06;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo06
 * @className ThreadDomain
 * @date 2019/6/25 23:36
 * @description ThreadDomain
 */
public class ThreadDomain {
	public void testMethod(Object lock) {
		try {
			synchronized (lock) {
				System.out.println("Begin wait(), ThreadName = " + Thread.currentThread().getName());
				lock.wait();
				System.out.println("End wait(), ThreadName = " + Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void synNotifyMethod(Object lock) {
		try {
			synchronized (lock) {
				System.out.println("Begin notify(), ThreadName = " + Thread.currentThread().getName());
				lock.notify();
				Thread.sleep(5000);
				System.out.println("End notify(), ThreadName = " + Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
