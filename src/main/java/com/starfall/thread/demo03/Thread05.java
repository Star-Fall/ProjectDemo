package com.starfall.thread.demo03;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo03
 * @className Thread05
 * @date 2019/6/16 15:05
 * @description Thread05
 */
public class Thread05 extends Thread {

	private ThreadBean05 bean;

	public Thread05(ThreadBean05 bean, String name) {
		this.bean = bean;
		this.setName(name);
	}

	@Override
	public void run() {
		bean.print("AA");
		//bean.print(this.getName());
	}
}
