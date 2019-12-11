package com.starfall.designpattern.ObserverPattern;

/**
 * @author StarFall
 * @date 2019/12/10 22:38
 * @description 具体观察者角色（ConcreteObserver）
 */
public class ConcreteObserver implements Observer {

	/**
	 * 观察者的状态
	 */
	private String observerStatus;

	// 观察者名称
	private String observerName;

	public ConcreteObserver(String observerName) {
		this.observerName = observerName;
	}

	/**
	 * 更新数据方法
	 *
	 * @param statu
	 *            状态
	 */
	@Override
	public void update(String statu) {
		this.observerStatus = statu;
		System.out.println("观察者【" + this.observerName + "】状态更新为： " + this.observerStatus);
	}
}