package com.starfall.thread.demo01;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo01
 * @className Thread01
 * @date 2019/6/6 17:28
 * @description Thread01
 */
public class Thread01 extends Thread {
	private  int count = 10;

	public void run() {
		for (int i = 0; i < 20; i++) {
			if (count > 0) {
				System.out.println(this.getName() + " 卖票：ticket" + count--);
			}
		}
	}
}
