package com.starfall.concurrency.demo01;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.concurrency.demo01
 * @className Concurrency01
 * @date 2019/7/16 21:58
 * @description Concurrency01
 */
public class Concurrency01 {

	private static final long count = 10000 * 10000*10l;

	/**
	 * 两个循环并发执行
	 * 
	 * @throws InterruptedException
	 */
	private static void concurrency() throws InterruptedException {
		long start = System.currentTimeMillis();
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				int a = 0;
				for (long i = 0; i < count; i++) {
					a += 5;
				}
			}
		});
		thread.start();
		int b = 0;
		for (long i = 0; i < count; i++) {
			b--;
		}
		long timeMillis = System.currentTimeMillis() - start;
		thread.join();
		System.out.println("concurrency = " + timeMillis + "ms，b = " + b);
	}

	/**
	 * 两个循环串行执行
	 */
	private static void serial() {
		long start = System.currentTimeMillis();
		int a = 0;
		for (long i = 0; i < count; i++) {
			a += 5;
		}
		int b = 0;
		for (long i = 0; i < count; i++) {
			b--;
		}
		long timeMillis = System.currentTimeMillis() - start;
		System.out.println("serial = " + timeMillis + "ms，a = " + a);
	}

	public static void main(String[] args) throws InterruptedException {
		concurrency();
		serial();
	}
}
