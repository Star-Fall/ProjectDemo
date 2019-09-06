package com.starfall.designpattern.bridgepattern.example;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.bridgepattern.example
 * @className MessageImplementor
 * @date 2019/9/6 17:17
 * @description 消息发送接口，提供发送方法
 */
public interface MessageImplementor {
	/**
	 * 发送方法
	 * 
	 * @param message
	 *            要发送消息的内容
	 * @param toUser
	 *            消息的接受者
	 */
	public void send(String message, String toUser);
}
