package com.starfall.designpattern.ChainofResponsibilityPattern.single;

/**
 * @author StarFall
 * @date 2019/11/24 19:51
 * @description 抽象处理者（Handler）
 */
public abstract class Handler {

	/**
	 * 下家处理者的引用
	 */
	private Handler nextHandler;

	/**
	 * 声明处理请求的方法
	 */
	public abstract void handler(int request);

	public Handler getNextHandler() {
		if (this.nextHandler == null) {
			this.nextHandler = new DefaultHandler();
		}
		return nextHandler;
	}

	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}
}