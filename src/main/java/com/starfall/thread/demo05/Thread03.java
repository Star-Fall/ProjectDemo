package com.starfall.thread.demo05;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo05
 * @className Thread03
 * @date 2019/6/17 23:41
 * @description todo
 */
public class Thread03 extends Thread {
	private volatile ThreadBean03 bean;

	public Thread03(ThreadBean03 bean) {
		this.bean = bean;
	}

	private void add() {
		for (int i = 0; i < 100; i++) {
			bean.count++;
		}
		System.out.println(Thread.currentThread().getName() + " count=" + bean.count);
	}

	@Override
	public void run() {
		add();
	}
}
