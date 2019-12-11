package com.starfall.designpattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author StarFall
 * @date 2019/12/10 22:40
 * @description 抽象目标角色（Subject）
 */
public abstract class Subject {

	/**
	 * 观察者集合
	 */
	private List<Observer> observers = new ArrayList<>();

	/**
	 * 订阅
	 * 
	 * @param observer
	 *            观察者
	 */
	public void subscribe(Observer observer) {
		this.observers.add(observer);
	}

	/**
	 * 退订
	 * 
	 * @param observer
	 *            观察者
	 */
	public void unsubscribe(Observer observer) {
		if (this.observers.contains(observer)) {
			this.observers.remove(observer);
		}
	}

	/**
	 * 通知所有的观察者
	 * 
	 * @param status
	 *            状态
	 */
	public void nodifyObservers(String status) {
		for (Observer observer : observers) {
			observer.update(status);
		}
	}
}