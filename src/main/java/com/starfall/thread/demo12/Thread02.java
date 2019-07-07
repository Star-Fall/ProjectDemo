package com.starfall.thread.demo12;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo12
 * @className Thread02
 * @date 2019/7/7 22:40
 * @description Thread02
 */
public class Thread02 extends Thread {
	public Thread02(String name) {
		super(name);
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				Thread.sleep(3);
				System.out.println(this.getName() + " isDaemon " + this.isDaemon() + "\t loop=" + i);
			}
			System.out.println("用户线程" + this.getName() + "运行完毕！");
		} catch (InterruptedException e) {
		}
	}
}
