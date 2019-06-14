package com.starfall.thread.demo02;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo02
 * @className Thread02
 * @date 2019/6/14 16:14
 * @description Thread02方法与锁对象
 */
public class Thread02 extends Thread {

	private ThreadBean02 bean;

	public Thread02(ThreadBean02 bean) {
		this.bean = bean;

	}

	public void run() {
		if ("A".equals(this.getName())) {
			bean.methodA();
		} else {
			bean.methodB();
		}
	}
}
