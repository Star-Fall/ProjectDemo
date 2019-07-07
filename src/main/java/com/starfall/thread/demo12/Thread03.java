package com.starfall.thread.demo12;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo12
 * @className Thread03
 * @date 2019/7/7 22:41
 * @description Thread03
 */
public class Thread03 extends Thread {
	public Thread03(String name) {
		super(name);
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 1000; i++) {
				Thread.sleep(1);
				System.out.println(this.getName() + " isDaemon " + this.isDaemon() + "\t loop=" + i);
			}
		} catch (InterruptedException e) {
		}
	}
}
