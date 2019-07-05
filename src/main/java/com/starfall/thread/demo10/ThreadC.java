package com.starfall.thread.demo10;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo10
 * @className ThreadC
 * @date 2019/7/5 11:10
 * @description ThreadC
 */
public class ThreadC extends Thread {

	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("ThreadC get value = " + Tools.inheritableThreadLocal.get());
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
