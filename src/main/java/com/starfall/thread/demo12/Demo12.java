package com.starfall.thread.demo12;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo12
 * @className Demo12
 * @date 2019/7/7 22:08
 * @description Demo12
 */
public class Demo12 {

	public void test01() {
		Thread01 thread01 = new Thread01();
		Thread01 thread02 = new Thread01();
		Thread01 thread03 = new Thread01();
		thread01.setPriority(1);
		thread02.setPriority(2);
		thread03.setPriority(3);

		thread01.start();
		thread02.start();
		thread03.start();
	}

	public void test02() {

		Thread02 thread02 = new Thread02("Thread-0");
		Thread03 thread03 = new Thread03("Thread_Daemon");
		thread03.setDaemon(true);
		thread02.start();
		thread03.start();
		System.out.println("Main 线程 运行完毕！end！");

	}

	public static void main(String[] args) {
		Demo12 demo12 = new Demo12();
		demo12.test02();
	}
}
