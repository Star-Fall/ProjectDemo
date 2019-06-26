package com.starfall.thread.demo07;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo07
 * @className Demo07
 * @date 2019/6/26 23:20
 * @description Demo07
 */
public class Demo07 {

	public void test01() {
		Object lock = new Object();
		final Producer producer = new Producer(lock);
		final Customer customer = new Customer(lock);
		Runnable producerRunnable = new Runnable() {
			public void run() {
				while (true) {
					producer.setValue();
				}
			}
		};
		Runnable customerRunnable = new Runnable() {
			public void run() {
				while (true) {
					customer.getValue();
				}
			}
		};
		Thread producerThread = new Thread(producerRunnable);
		Thread CustomerThread = new Thread(customerRunnable);
		producerThread.start();
		CustomerThread.start();
	}

	public static void main(String[] args) {
		Demo07 demo07 = new Demo07();
		demo07.test01();
	}
}
