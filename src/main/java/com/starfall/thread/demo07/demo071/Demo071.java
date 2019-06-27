package com.starfall.thread.demo07.demo071;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo07.demo071
 * @className Demo071
 * @date 2019/6/27 14:58
 * @description Demo071
 */
public class Demo071 {

	public static void main(String[] args) throws InterruptedException {
		Object lock = new Object();
		Producer p = new Producer(lock);
		Customer c = new Customer(lock);

		ThreadP p1 = new ThreadP(p);
		ThreadP p2 = new ThreadP(p);
		ThreadC c1 = new ThreadC(c);
		ThreadC c2 = new ThreadC(c);
		p1.start();
		c1.start();
		p2.start();
		c2.start();

		Thread.sleep(7000);
		Thread[] arry = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
		Thread.currentThread().getThreadGroup().enumerate(arry);
		for (int i = 0; i < arry.length; i++) {
			System.out.println(arry[i].getName() + " - " + arry[i].getState());
		}
	}
}
