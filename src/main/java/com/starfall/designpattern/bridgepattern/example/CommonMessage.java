package com.starfall.designpattern.bridgepattern.example;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.bridgepattern.example
 * @className CommonMessage
 * @date 2019/9/6 17:30
 * @description 普通消息
 */
public class CommonMessage extends AbstractMessage {

	public CommonMessage(MessageImplementor messageImplementor) {
		super(messageImplementor);
	}

	@Override
	public void sendMessage(String message, String toUser) {
		// 对于普通消息，直接调用父类方法，发送消息即可
		super.sendMessage(message, toUser);
	}
}