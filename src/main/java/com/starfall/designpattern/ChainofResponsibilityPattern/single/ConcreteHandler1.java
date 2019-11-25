package com.starfall.designpattern.ChainofResponsibilityPattern.single;

/**
 * @author StarFall
 * @date 2019/11/24 20:05
 * @description 具体处理者（ConcreteHandler）1
 */
public class ConcreteHandler1 extends Handler {
	/**
	 * 声明处理请求的方法
	 */
	@Override
	public void handler(int request) {
		if (request < 10) {
			System.out.println(this.getClass().getName() + "处理了请求,参数：" + request);
		} else {
			System.out.println(this.getClass().getName() + " 转发请求");
			getNextHandler().handler(request);
		}
	}
}