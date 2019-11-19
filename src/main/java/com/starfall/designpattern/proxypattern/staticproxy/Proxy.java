package com.starfall.designpattern.proxypattern.staticproxy;

/**
 * @author StarFall
 * @date 2019/11/19 22:47
 * @description 代理对象角色
 */
public class Proxy implements Subject {

	private Subject subject;

	public Proxy(Subject subject) {
		this.subject = subject;
	}

	/**
	 * 代理调用目标对象方法
	 */
	@Override
	public void request() {
		this.before();
		this.subject.request();
		this.after();
	}

	private void before() {
		System.out.println("-------before-------");
	}

	private void after() {
		System.out.println("-------after-------");
	}
}