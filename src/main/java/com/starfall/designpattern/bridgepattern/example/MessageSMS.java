package com.starfall.designpattern.bridgepattern.example;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.bridgepattern.example
 * @className MessageSMS
 * @date 2019/9/6 17:19
 * @description 使用短信发送消息
 */
public class MessageSMS implements MessageImplementor {

	@Override
	public void send(String message, String toUser) {
		System.out.println("使用短信发送消息，发送消息：" + message + " 给 " + toUser);
	}
}
