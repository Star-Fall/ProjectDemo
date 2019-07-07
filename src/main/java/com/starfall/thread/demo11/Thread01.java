package com.starfall.thread.demo11;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo11
 * @className Thread01
 * @date 2019/7/7 15:51
 * @description Thread01
 */
public class Thread01 implements Runnable{
	@Override
	public void run() {
		try {
			while (!Thread.currentThread().isInterrupted()) {
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
