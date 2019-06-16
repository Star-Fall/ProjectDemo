package com.starfall.thread.demo04;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo04
 * @className Thread01
 * @date 2019/6/16 16:19
 * @description Thread01
 */
public class Thread01 extends Thread {

	private ThreadBean01 bean;

	public Thread01(ThreadBean01 bean, String name) {
		this.bean = bean;
		this.setName(name);
	}

	@Override
	public void run() {
		if ("A".equals(this.getName())) {
			bean.methodA();
		} else {
			bean.methodB();
		}
	}
}
