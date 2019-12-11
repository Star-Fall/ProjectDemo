package com.starfall.designpattern.MediatorPattern.example;

import java.util.Timer;

public class TimerTest {
	public static void main(String[] args) {
		// 注意：多线程并行处理定时任务时，Timer运行多个TimeTask时，只要其中之一没有捕获抛出的异常，
		// 其它任务便会自动终止运行，使用ScheduledExecutorService则没有这个问题
		Timer timer = new Timer();
		// 3秒后开始运行，循环周期为 1秒
		timer.schedule(new MyOneTask(), 3000, 1000);
		timer.schedule(new MyTwoTask(), 3000, 1000);
	}
}