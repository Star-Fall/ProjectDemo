package com.starfall.designpattern.ObserverPattern;

/**
 * @author StarFall
 * @date 2019/12/10 23:00
 * @description 具体目标角色（ConcreteSubject）
 */
public class ConcreteSubject extends Subject {
	/**
	 * 目标角色状态
	 */
	private String status;

	public void change(String status) {
		this.status = status;
		System.out.println("目标角色状态变化：" + this.status + " ，通知观察者们。。。");
		this.nodifyObservers(status);
	}
}