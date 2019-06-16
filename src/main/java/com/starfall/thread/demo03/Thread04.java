package com.starfall.thread.demo03;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo03
 * @className Thread04
 * @date 2019/6/15 23:22
 * @description Thread04
 */
public class Thread04 extends Thread {
	private ThreadBean04 bean;

	public Thread04(ThreadBean04 bean, String name) {
		this.bean = bean;
		this.setName(name);
	}

	@Override
	public void run() {
		if ("A".equals(this.getName())) {
			ThreadBean04.printA();
		} else if ("B".equals(this.getName())) {
			ThreadBean04.printB();
		} else {
			bean.printC();
		}
	}
}
