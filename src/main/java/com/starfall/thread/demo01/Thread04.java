package com.starfall.thread.demo01;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo01
 * @className Thread04
 * @date 2019/6/12 15:06
 * @description Thread的 isAlive方法
 */
public class Thread04 extends Thread {
	@Override
	public void run() {
		System.out.println("this: " + this.isAlive());
	}
}
