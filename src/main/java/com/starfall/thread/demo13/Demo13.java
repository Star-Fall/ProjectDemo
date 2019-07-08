package com.starfall.thread.demo13;

import java.util.Date;
import java.util.Timer;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo13
 * @className Demo13
 * @date 2019/7/7 23:03
 * @description Demo13
 */
public class Demo13 {
	/**
	 * schedule(TimerTask task, Date time)<br>
	 * 执行时间晚于当前时间：未来执行
	 */
	public void test01() {
		Timer timer = new Timer();
		Task01 task01 = new Task01();
		String dateTime = "2019-07-08 15:38:30";
		System.out.println("设置计划任务的时间：" + dateTime);
		timer.schedule(task01, Tools.getDate(dateTime, Tools.PATTER));
	}

	/**
	 * schedule(TimerTask task, Date time)<br>
	 * 执行时间早于当前时间：立即执行
	 */
	public void test02() {
		Timer timer = new Timer();
		Task01 task01 = new Task01();
		String dateTime = "2019-07-07 23:49:30";
		System.out.println("设置计划任务的时间：" + dateTime);
		timer.schedule(task01, Tools.getDate(dateTime, Tools.PATTER));
	}

	/**
	 * schedule(TimerTask task, Date time)<br>
	 * 多任务执行：延时问题
	 */
	public void test03() {
		Timer timer = new Timer();
		Task01 task01 = new Task01();
		Task01 task02 = new Task01();
		String dateTime = "2019-07-08 15:58:00";
		System.out.println("设置计划任务的时间：" + dateTime);
		timer.schedule(task01, Tools.getDate(dateTime, Tools.PATTER));
		timer.schedule(task02, Tools.getDate(dateTime, Tools.PATTER));
	}

	/**
	 * schedule(TimerTask task, Date firstTime, long period)<br>
	 * 执行时间晚于当前时间：未来执行
	 */
	public void test04() {
		Timer timer = new Timer();
		Task01 task01 = new Task01();
		String dateTime = "2019-07-08 16:49:00";
		System.out.println("设置计划任务的时间：" + dateTime);
		timer.schedule(task01, Tools.getDate(dateTime, Tools.PATTER), 5000);
	}

	/**
	 * schedule(TimerTask task, Date firstTime, long period)<br>
	 * 执行时间早于当前时间：立即执行
	 */
	public void test05() {
		Timer timer = new Timer();
		Task01 task01 = new Task01();
		String dateTime = "2019-07-07 16:00:00";
		System.out.println("设置计划任务的时间：" + dateTime);
		timer.schedule(task01, Tools.getDate(dateTime, Tools.PATTER), 5000);
	}

	/**
	 * schedule(TimerTask task, Date firstTime, long period)<br>
	 * 多任务执行：延时问题
	 */
	public void test06() {
		Timer timer = new Timer();
		Task01 task01 = new Task01();
		Task01 task02 = new Task01();
		String dateTime = "2019-07-08 16:54:00";
		System.out.println("设置计划任务的时间：" + dateTime);
		timer.schedule(task01, Tools.getDate(dateTime, Tools.PATTER), 5000);
		timer.schedule(task02, Tools.getDate(dateTime, Tools.PATTER), 5000);
	}

	/**
	 * TimerTask的cancel方法、 Timer的cancel方法
	 */
	public void test07() {
		Timer timer = new Timer();
		Task01 task01 = new Task01();
		Task02 task02 = new Task02();
		String dateTime = "2019-07-08 17:14:00";
		System.out.println("设置计划任务的时间：" + dateTime);
		timer.schedule(task01, Tools.getDate(dateTime, Tools.PATTER), 3000);
		timer.schedule(task02, Tools.getDate(dateTime, Tools.PATTER), 3000);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		timer.cancel();
	}

	/**
	 * schedule(TimerTask task, long delay)
	 */
	public void test08() {
		Timer timer = new Timer();
		Task01 task01 = new Task01();
		System.out.println("设置计划任务的时间：" + Tools.getDateFomatter(new Date()));
		timer.schedule(task01, 3000);
	}

	/**
	 * schedule(TimerTask task, long delay, long period)
	 */
	public void test09() {
		Timer timer = new Timer();
		Task01 task01 = new Task01();
		System.out.println("设置计划任务的时间：" + Tools.getDateFomatter(new Date()));
		timer.schedule(task01, 3000, 4000);
	}

	public void test10() {
		Timer timer = new Timer();
		Task03 task03 = new Task03();
		String dateTime = "2019-07-08 22:44:00";
		System.out.println("设置计划任务的时间：" + dateTime);
		//timer.schedule(task03, Tools.getDate(dateTime, Tools.PATTER), 3000);
		timer.scheduleAtFixedRate(task03, Tools.getDate(dateTime, Tools.PATTER), 3000);
	}

	public static void main(String[] args) {
		Demo13 demo13 = new Demo13();
		demo13.test10();
	}
}