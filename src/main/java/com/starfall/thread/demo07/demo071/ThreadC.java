package com.starfall.thread.demo07.demo071;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo07.demo071
 * @className ThreadC
 * @date 2019/6/27 14:57
 * @description ThreadC
 */
public class ThreadC extends Thread {
	private Customer c;

	public ThreadC(Customer c) {
		this.c = c;
	}

	@Override
	public void run() {
		while (true) {
			c.getValue();
		}
	}
}
