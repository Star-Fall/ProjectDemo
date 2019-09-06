package com.starfall.designpattern.bridgepattern.example;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.bridgepattern.example
 * @className MessageEmail
 * @date 2019/9/6 17:20
 * @description 使用Email邮件发送消息
 */
public class MessageEmail implements MessageImplementor {
	@Override
	public void send(String message, String toUser) {
		System.out.println("使用Email邮件发送消息，发送消息：" + message + " 给 " + toUser);
	}
}
