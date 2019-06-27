package com.starfall.thread.demo07.demo071;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo07.demo071
 * @className ThreadP
 * @date 2019/6/27 14:56
 * @description ThreadP
 */
public class ThreadP extends Thread {

	private Producer p;

	public ThreadP(Producer p) {
		this.p = p;
	}

	@Override
	public void run() {
		while (true) {
			p.setValue();
		}
	}
}
