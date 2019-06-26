package com.starfall.thread.demo06;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo06
 * @className ThreadDomain01
 * @date 2019/6/26 21:22
 * @description ThreadDomain01
 */
public class ThreadDomain01 {

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
}
