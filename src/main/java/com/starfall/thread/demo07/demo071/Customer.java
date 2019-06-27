package com.starfall.thread.demo07.demo071;

import com.starfall.thread.demo07.ValueObject;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo07.demo071
 * @className Customer
 * @date 2019/6/27 14:52
 * @description Customer
 */
public class Customer {
	private Object lock;

	public Customer(Object lock) {
		this.lock = lock;
	}

	public void getValue() {
		try {
			synchronized (lock) {
				while (ValueObject.value.equals("")) {
					System.out.println("消费者-" + Thread.currentThread().getName() + " waiting 中...");
					lock.wait();
				}
				System.out.println("消费者-" + Thread.currentThread().getName() + " Get的值是：" + ValueObject.value);
				ValueObject.value = "";
				lock.notify();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
