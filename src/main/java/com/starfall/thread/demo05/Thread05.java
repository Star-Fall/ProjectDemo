package com.starfall.thread.demo05;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo05
 * @className Thread05
 * @date 2019/6/17 23:56
 * @description todo
 */
public class Thread05 extends Thread {

	private ThreadBean04 bean;

	public Thread05(ThreadBean04 bean, String name) {
		this.bean = bean;
		this.setName(name);
	}

	public void run() {
		if ("A".equals(this.getName())) {
			bean.runMethod();
		} else {
			bean.stopMethod();
		}
	}
}
