package com.starfall.thread.demo11;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo11
 * @className Thread02
 * @date 2019/7/7 18:20
 * @description Thread02
 */
public class Thread02 extends Thread {
	public Thread02(ThreadGroup group, String name) {
		super(group, name);
	}

	@Override
	public void run() {
		System.out.println("ThreadName = " + Thread.currentThread().getName() + "准备开始死循环了");
		while (!this.isInterrupted()) {
		}
		System.out.println("ThreadName = " + Thread.currentThread().getName() + "结束了");
	}
}
