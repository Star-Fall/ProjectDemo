package com.starfall.designpattern.proxypattern.jdkproxy;

/**
 * @author StarFall
 * @date 2019/11/19 23:22
 * @description 抽象目标对象，委托类和代理类共同实现的接口
 */
public interface Subject {

	/**
	 * 定义目标对象方法
	 */
	public void request();
}