package com.starfall.thread.demo01;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo01
 * @className Thread05
 * @date 2019/6/12 16:46
 * @description Thread的currentThread方法和
 */
public class Thread05 extends Thread {

	static {
		// System.out.println("静态块的打印：" + Thread.currentThread().getName());
	}

	public Thread05() {
		// System.out.println("构造方法的打印：" + Thread.currentThread().getName());

		System.out.println("构造方法************Begin");
		System.out.println("Thread.currentThread().getName()----->" + Thread.currentThread().getName());
		System.out.println("this.getName()----->" + this.getName());
		System.out.println("构造方法************end");
	}

	public void run() {
		// System.out.println("run()方法的打印：" + Thread.currentThread().getName());
		System.out.println("run方法************Begin");
		System.out.println("Thread.currentThread().getName()----->" + Thread.currentThread().getName());
		System.out.println("this.getName()----->" + this.getName());
		System.out.println("run方法************end");
	}
}
