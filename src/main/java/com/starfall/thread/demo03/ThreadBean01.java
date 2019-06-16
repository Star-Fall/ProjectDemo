package com.starfall.thread.demo03;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo03
 * @className ThreadBean01
 * @date 2019/6/15 17:47
 * @description ThreadBean01
 */
public class ThreadBean01 {

	public void doLongTimeTask() {
		for (int i = 0; i < 10; i++) {
			System.out.println("no-synchronized " + Thread.currentThread().getName() + ", i = " + (i + 1));
		}
		System.out.println("***********************nosynchronized");
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				System.out
						.println("synchronized " + Thread.currentThread().getName() + ", i = " + (i + 1));
			}
			System.out.println("***********************synchronized");
		}
	}
}
