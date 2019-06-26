package com.starfall.thread.demo07;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo07
 * @className Producer
 * @date 2019/6/26 23:24
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
				if (!ValueObject.value.equals(""))
					lock.wait();
				String value = System.currentTimeMillis() + "_" + System.nanoTime();
				System.out.println("Set的值是：" + value);
				ValueObject.value = value;
				lock.notify();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
