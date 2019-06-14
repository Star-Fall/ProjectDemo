package com.starfall.thread.demo02;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo02
 * @className ThreadBean02
 * @date 2019/6/14 16:12
 * @description 方法与锁对象
 */
public class ThreadBean02 {

	public synchronized void methodA() {
		try {

			System.out.println("Begin methodA, threadName = " + Thread.currentThread().getName());
			Thread.sleep(2000);
			System.out.println("End methodA, threadName = " + Thread.currentThread().getName() + ", end Time = "
					+ System.currentTimeMillis());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public synchronized void methodB() {
		try {
			System.out.println("Begin methodB, threadName = " + Thread.currentThread().getName() + ", begin time = "
					+ System.currentTimeMillis());
			Thread.sleep(2000);
			System.out.println("End methodB, threadName = " + Thread.currentThread().getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
