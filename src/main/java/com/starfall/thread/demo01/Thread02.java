package com.starfall.thread.demo01;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo01
 * @className Thread02
 * @date 2019/6/6 17:39
 * @description todo
 */
public class Thread02 implements Runnable {
	private int count = 10;

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			if (count > 0) {
				System.out.println(Thread.currentThread().getName() + " 卖票：ticket" + count--);
			}
		}
	}
}
