package com.starfall.thread.demo05;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo05
 * @className ThreadBean03
 * @date 2019/6/17 23:42
 * @description ThreadBean04
 */
public class ThreadBean04 {
	private boolean isRunning = true;

	public void runMethod() {
		Object o = new Object();
		while (isRunning) {
			synchronized (o) {

			}
		}
		System.out.println("停下来！");
	}

	public void stopMethod() {
		isRunning = false;
	}
}
