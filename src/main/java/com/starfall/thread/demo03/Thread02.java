package com.starfall.thread.demo03;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo03
 * @className Thread01
 * @date 2019/6/15 17:49
 * @description Thread02
 */
public class Thread02 extends Thread {

	private ThreadBean02 bean;

	public Thread02(ThreadBean02 bean, String name) {
		this.bean = bean;
		this.setName(name);
	}

	@Override
	public void run() {
		if ("A".equals(this.getName())) {
			bean.serviceMethodA();
		} else {
			bean.serviceMethodB();
		}
	}
}
