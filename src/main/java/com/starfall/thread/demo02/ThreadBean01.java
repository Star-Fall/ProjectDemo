package com.starfall.thread.demo02;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo02
 * @className ThreadBean01
 * @date 2019/6/14 15:00
 * @description 线程安全
 */
public class ThreadBean01 {
	private int num = 0;

	public synchronized void addNum(String userName) {
		try {
			if ("a".equals(userName)) {
				num = 100;
				System.out.println("a set over!");
				Thread.sleep(2000);
			} else {
				num = 200;
				System.out.println("b set over!");
			}
			System.out.println(userName + " num = " + num);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
