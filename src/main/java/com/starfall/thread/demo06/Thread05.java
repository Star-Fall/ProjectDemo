package com.starfall.thread.demo06;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo06
 * @className Thread05
 * @date 2019/6/26 21:44
 * @description Thread05
 */
public class Thread05 extends Thread {

	@Override
	public void run() {
		synchronized (this) {
			try {
				System.out.println("开始------wait time = " + System.currentTimeMillis());
				this.wait(3000);
				System.out.println("结束------wait time = " + System.currentTimeMillis());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
