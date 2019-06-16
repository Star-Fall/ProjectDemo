package com.starfall.thread.demo04;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo04
 * @className ThreadBean01
 * @date 2019/6/16 16:18
 * @description ThreadBean01
 */
public class ThreadBean01 {

	private final Object a = new Object();
	private final Object b = new Object();

	public void methodA() {
		synchronized (a) {
			try {
				System.out.println(Thread.currentThread().getName() + " methodA lock a");
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (b) {
				System.out.println(Thread.currentThread().getName() + " methodA a->b");
			}
		}
	}

	public void methodB() {
		synchronized (b) {
			try {
				System.out.println(Thread.currentThread().getName() + " methodB lock b");
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (a) {
				System.out.println(Thread.currentThread().getName() + " methodB b->a");
			}
		}
	}
}
