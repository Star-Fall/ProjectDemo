package com.starfall.thread.demo07.demo071;

import com.starfall.thread.demo07.ValueObject;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo07.demo071
 * @className Producer
 * @date 2019/6/27 14:52
 * @description Producer
 */
public class Producer {
	private Object lock;

	public Producer(Object lock) {
		this.lock = lock;
	}

	public void setValue() {
		try {
			synchronized (lock) {
				while (!ValueObject.value.equals("")) {
					System.out.println("生产者-" + Thread.currentThread().getName() + " waiting 中...");
					lock.wait();
				}
				String value = System.currentTimeMillis() + "_" + System.nanoTime();
				System.out.println("生产者-" + Thread.currentThread().getName() + " Set的值是：" + value);
				ValueObject.value = value;
				lock.notify();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
