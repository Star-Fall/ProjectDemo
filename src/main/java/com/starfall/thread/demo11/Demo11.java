package com.starfall.thread.demo11;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo11
 * @className Demo11
 * @date 2019/7/5 17:27
 * @description Demo11
 */
public class Demo11 {

	public void test() {
		System.out.println("当前线程组的线程状态如下：");
		Thread[] arry = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
		Thread.currentThread().getThreadGroup().enumerate(arry);
		for (int i = 0; i < arry.length; i++) {
			System.out.println(arry[i].getName() + " - " + arry[i].getState());
		}
	}

	public void test01() {
		ThreadGroup group = new ThreadGroup("线程组");
		Thread thread01 = new Thread(group, new Thread01());
		Thread thread02 = new Thread(group, new Thread01());
		thread01.start();
		thread02.start();
		System.out.println("活动的线程数为：" + group.activeCount());
		System.out.println("线程组的名称为：" + group.getName());
		System.out.println(thread01.getName());
		System.out.println(thread02.getName());
	}

	public void test02() {
		ThreadGroup groupMain = Thread.currentThread().getThreadGroup();
		ThreadGroup groupA = new ThreadGroup(groupMain, "A");
		ThreadGroup groupB = new ThreadGroup(groupMain, "B");
		Thread threadA = new Thread(groupA, new Thread01());
		Thread threadB = new Thread(groupB, new Thread01());
		threadA.start();
		threadB.start();
		// 显示线程组详情
		printThreadGroup(groupMain);
	}

	/**
	 * 打印线程组中的子线程组详情
	 * 
	 * @param group
	 */
	private void printThreadGroup(ThreadGroup group) {
		System.out.println("打印线程组" + group.getName() + "中的子线程组详情：");
		if (group.activeGroupCount() <= 0) {
			System.out.println(group.getName() + " 中没有子线程组！");
			return;
		}
		ThreadGroup[] groups = new ThreadGroup[group.activeGroupCount()];
		group.enumerate(groups);
		for (int i = 0; i < groups.length; i++) {
			System.out.println("线程组名称：" + groups[i].getName() + " , 父线程：" + groups[i].getParent());
			printThread(groups[i]);
		}
	}

	/**
	 * 打印线程组中的子线程详情
	 * 
	 * @param group
	 */
	private void printThread(ThreadGroup group) {
		System.out.println("\t" + "打印线程组中的子线程详情：");
		Thread[] arry = new Thread[group.activeCount()];
		group.enumerate(arry);
		for (int i = 0; i < arry.length; i++) {
			System.out.println("\t" + "线程名称：" + arry[i].getName() + " , 线程状态：" + arry[i].getState());
		}
	}

	public void test03() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		printThreadGroup(Thread.currentThread().getThreadGroup());
		printThread(Thread.currentThread().getThreadGroup());

		System.out.println("实例化了一个group");
		ThreadGroup group = new ThreadGroup("NEW GROUP");

		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		printThreadGroup(Thread.currentThread().getThreadGroup());
		printThread(Thread.currentThread().getThreadGroup());
	}

	public void test04() {
		System.out.println("当前线程组名称：" + Thread.currentThread().getThreadGroup().getName());
		System.out.println("当前线程组的父线程组名称：" + Thread.currentThread().getThreadGroup().getParent().getName());
		System.out.println(
				"当前线程组的父线程组的父线程组名称：" + Thread.currentThread().getThreadGroup().getParent().getParent().getName());
	}

	public void test05() {
		try {
			ThreadGroup group = new ThreadGroup("我的线程组");
			Thread02 mt = null;
			for (int i = 0; i < 3; i++) {
				mt = new Thread02(group, "线程" + i);
				mt.start();
			}
			Thread.sleep(1000);
			group.interrupt();
			System.out.println("线程组调用了interrupt()方法");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Demo11 demo11 = new Demo11();
		demo11.test05();
	}
}
