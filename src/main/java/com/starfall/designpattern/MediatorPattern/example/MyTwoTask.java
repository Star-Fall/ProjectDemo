package com.starfall.designpattern.MediatorPattern.example;

import java.util.TimerTask;

/**
 * @author StarFall
 * @date 2019/12/3 23:58
 * @description 定时任务Two
 */
public class MyTwoTask extends TimerTask {
	private int num = 0;

	@Override
	public void run() {
		System.out.println("MyOneTask :" + ++num);
	}
}