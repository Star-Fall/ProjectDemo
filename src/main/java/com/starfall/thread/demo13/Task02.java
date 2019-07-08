package com.starfall.thread.demo13;

import java.util.Date;
import java.util.TimerTask;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo13
 * @className Task02
 * @date 2019/7/8 17:03
 * @description Task02
 */
public class Task02 extends TimerTask {

	@Override
	public void run() {
		System.out.println("Task02 执行任务start！当前时间为：" + Tools.getDateFomatter(new Date()));
		try {
			Thread.sleep(1000);
			this.cancel();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Task02 执行任务end！当前时间为：" + Tools.getDateFomatter(new Date()));
	}
}