package com.starfall.thread.demo10;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo10
 * @className Demo10
 * @date 2019/7/3 23:21
 * @description Demo10
 */
public class Demo10 {

	public void test01() {
		ThreadA threadA = new ThreadA();
		threadA.setName("ThreadA");

		ThreadB threadB = new ThreadB();
		threadB.setName("ThreadB");
		threadA.start();
		threadB.start();
	}

	public void test02() {
		try {
			Tools.inheritableThreadLocal.set("Main线程 - " + 1);
			System.out.println("Main线程 get value = " + Tools.inheritableThreadLocal.get());
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ThreadC threadC = new ThreadC();
		threadC.setName("ThreadC");
		threadC.start();
		System.out.println("Main线程修改值");
		Tools.inheritableThreadLocal.set("Main线程 - " + 2);
		System.out.println("Main线程 get value = " + Tools.inheritableThreadLocal.get());
	}

	public static void main(String[] args) {
		Demo10 demo10 = new Demo10();
		demo10.test02();
	}
}
