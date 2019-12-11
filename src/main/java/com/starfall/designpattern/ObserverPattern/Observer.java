package com.starfall.designpattern.ObserverPattern;

/**
 * @author StarFall
 * @date 2019/12/10 22:33
 * @description 抽象观察者角色（Observer）
 */
public interface Observer {

	/**
	 * 更新数据方法
	 * 
	 * @param statu
	 *            状态
	 */
	public void update(String statu);
}