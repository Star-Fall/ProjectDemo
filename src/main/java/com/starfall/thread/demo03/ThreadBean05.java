package com.starfall.thread.demo03;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo03
 * @className ThreadBean05
 * @date 2019/6/16 15:02
 * @description ThreadBean05
 */
public class ThreadBean05 {

	public void print(String str) {
		try {
			synchronized (str) {
				while (true) {
					System.out.println(Thread.currentThread().getName());
					Thread.sleep(1000);
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
