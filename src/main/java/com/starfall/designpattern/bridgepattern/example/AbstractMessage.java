package com.starfall.designpattern.bridgepattern.example;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.bridgepattern.example
 * @className AbstractMessage
 * @date 2019/9/6 17:21
 * @description 抽象消息类，对消息种类的抽象
 */
public abstract class AbstractMessage {

	/**
	 * 持有实现化对象，即消息发送接口
	 */
	private MessageImplementor messageImplementor;

	public AbstractMessage(MessageImplementor messageImplementor) {
		this.messageImplementor = messageImplementor;
	}

	/**
	 * 发送消息，委派给实现部分的方法
	 * 
	 * @param message
	 *            要发送消息的内容
	 * @param toUser
	 *            消息的接受者
	 */
	public void sendMessage(String message, String toUser) {
		this.messageImplementor.send(message, toUser);
	}
}
