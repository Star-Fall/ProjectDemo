package com.starfall.thread.demo02;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo02
 * @className Thread01
 * @date 2019/6/14 15:09
 * @description Thread01非线程安全
 */
public class Thread01 extends Thread {
	private ThreadBean01 bean;

	public Thread01(ThreadBean01 bean) {
		this.bean = bean;
	}

	@Override
	public void run() {
		this.bean.addNum(this.getName());
	}
}
