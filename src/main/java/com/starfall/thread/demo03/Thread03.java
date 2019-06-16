package com.starfall.thread.demo03;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo03
 * @className Thread01
 * @date 2019/6/15 17:49
 * @description Thread02
 */
public class Thread03 extends Thread {

	private ThreadBean03 bean;

	public Thread03(ThreadBean03 bean, String name) {
		this.bean = bean;
		this.setName(name);
	}

	@Override
	public void run() {
		bean.setUserNamePassword(this.getName(), this.getName() + this.getName());
	}
}
