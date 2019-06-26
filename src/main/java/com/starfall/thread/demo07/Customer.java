package com.starfall.thread.demo07;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo07
 * @className Customer
 * @date 2019/6/26 23:24
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
				if (ValueObject.value.equals(""))
					lock.wait();
				System.out.println("Get的值是：" + ValueObject.value);
				ValueObject.value = "";
				lock.notify();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
