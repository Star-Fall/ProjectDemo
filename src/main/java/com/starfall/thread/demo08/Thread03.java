package com.starfall.thread.demo08;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo08
 * @className Thread03
 * @date 2019/6/30 17:47
 * @description 优雅的终止线程
 */
public class Thread03 extends Thread {
	@Override
	public void run() {
		super.run();
		try {
			for (int i = 0; i < 500000; i++) {
				if (this.interrupted()) {
					System.out.println("should be stopped and exit");
					throw new InterruptedException();
				}
				System.out.println("i=" + (i + 1));
			}
			System.out.println("this line cannot be executed. cause thread throws exception");
		} catch (InterruptedException e) {
			/**
			 * 这样处理不好<br>
			 * System.out.println("catch interrupted exception");<br>
			 * e.printStackTrace();
			 */
            System.out.println("catch interrupted exception : Thread.currentThread().interrupt();");
			Thread.currentThread().interrupt();// 这样处理比较好
		}
	}
}
