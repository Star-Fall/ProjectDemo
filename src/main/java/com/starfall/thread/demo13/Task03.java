package com.starfall.thread.demo13;

import java.util.Date;
import java.util.TimerTask;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo13
 * @className Task03
 * @date 2019/7/8 22:43
 * @description Task03
 */
public class Task03 extends TimerTask {
	@Override
	public void run() {
		System.out.println("执行任务start！当前时间为：" + Tools.getDateFomatter(new Date()));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("执行任务end！当前时间为：" + Tools.getDateFomatter(new Date()));
	}
}
