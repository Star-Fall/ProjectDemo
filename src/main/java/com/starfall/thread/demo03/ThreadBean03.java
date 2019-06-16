package com.starfall.thread.demo03;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo03
 * @className ThreadBean03
 * @date 2019/6/15 18:57
 * @description ThreadBean03
 */
public class ThreadBean03 {

	private String anyString = new String();
	private String userNameParam;
	private String passwordParam;

	public void setUserNamePassword(String userName, String password) {
		try {
			synchronized (anyString) {
				System.out.println(
						"线程名称为：" + Thread.currentThread().getName() + "在 " + System.currentTimeMillis() + " 进入同步代码块");
				userNameParam = userName;
				Thread.sleep(1000);
				passwordParam = password;
				System.out.println(
						"线程名称为：" + Thread.currentThread().getName() + "在 " + System.currentTimeMillis() + " 离开同步代码块");
				System.out.println(
						Thread.currentThread().getName() + " 的属性：" + this.userNameParam + "," + this.passwordParam);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
