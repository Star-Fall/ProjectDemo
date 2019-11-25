package com.starfall.designpattern.ChainofResponsibilityPattern.single;

/**
 * @author StarFall
 * @date 2019/11/24 20:10
 * @description 具体处理者（ConcreteHandler）默认处理器处理
 */
public class DefaultHandler extends Handler {
	/**
	 * 处理请求的方法
	 */
	@Override
	public void handler(int request) {
		System.out.println("默认处理器处理请求，参数：" + request);
	}
}