package com.starfall.thread.demo10;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo10
 * @className ThreadA
 * @date 2019/7/4 23:47
 * @description ThreadA
 */
public class ThreadB extends Thread {

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				Tools.threadLocal.set("ThreadB - " + (i + 1));
				System.out.println("ThreadB set value = " + (i + 1));
				Thread.sleep(100);
				System.out.println("ThreadB get value = " + Tools.threadLocal.get());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
