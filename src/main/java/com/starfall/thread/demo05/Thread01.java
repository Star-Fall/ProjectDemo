package com.starfall.thread.demo05;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo05
 * @className Thread01
 * @date 2019/6/16 22:53
 * @description Thread01
 */
public class Thread01 extends Thread {
	private volatile boolean isRunning = true;

	public boolean isRunning() {
		return isRunning;
	}

	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}

	public void run() {
		System.out.println("进入run了");
		while (isRunning == true) {
		}
		System.out.println("线程被停止了");
	}
}
