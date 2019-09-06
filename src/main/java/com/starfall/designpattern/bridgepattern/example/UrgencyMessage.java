package com.starfall.designpattern.bridgepattern.example;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.bridgepattern.example
 * @className UrgencyMessage
 * @date 2019/9/6 17:30
 * @description 加急消息
 */
public class UrgencyMessage extends AbstractMessage {

	public UrgencyMessage(MessageImplementor messageImplementor) {
		super(messageImplementor);
	}

	@Override
	public void sendMessage(String message, String toUser) {
		// 对于加急消息，对信息进行处理，增加 "加急："标志
		message = "'加急'" + message;
		super.sendMessage(message, toUser);
	}

	/**
	 * 扩展的功能
	 */
	public void otherMethod() {
		System.out.println("扩展自己的新功能...");
	}
}