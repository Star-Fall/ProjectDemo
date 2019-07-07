package com.starfall.thread.demo13;

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

	public void test01() {
		Timer timer = new Timer();
		Task01 task01 = new Task01();
		timer.schedule(task01, Tools.getDate("2019-07-07 23:49:30", Tools.PATTER));
	}

	public static void main(String[] args) {
		Demo13 demo13 = new Demo13();
		demo13.test01();
	}
}
