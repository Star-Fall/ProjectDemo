package com.starfall.thread.demo08;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo08
 * @className Thread02
 * @date 2019/6/30 17:28
 * @description Thread02
 */
public class Thread02 extends Thread {
	@Override
	public void run() {
		try {
			int count = 1;
			while (true) {
				System.out.println("count = " + count++);
				Thread.sleep(1000);
				// this.wait();
			}
		} catch (InterruptedException e) {
			System.out.println(this.getName() + " 在沉睡中终止");
			e.printStackTrace();
		}
	}
}
