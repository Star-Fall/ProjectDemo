package com.starfall.designpattern.bridgepattern.example;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.bridgepattern.example
 * @className TestClient
 * @date 2019/9/6 17:32
 * @description 测试端
 */
public class TestClient {

	public static void main(String[] args) {
		/**
		 * 使用短信发送普通信息和加急信息
		 */
		MessageImplementor messageSMS = new MessageSMS();
		// 普通信息
		AbstractMessage commonMessage = new CommonMessage(messageSMS);
		commonMessage.sendMessage("加班申请", "李总");
		// 加急信息
		AbstractMessage urgencyMessage = new UrgencyMessage(messageSMS);
		urgencyMessage.sendMessage("加班申请速批", "李总");

		System.out.println("*****************************");
		/**
		 * 使用Email发送普通信息和加急信息
		 */
		MessageImplementor messageEmail = new MessageEmail();
		// 普通信息
		AbstractMessage commonMessage1 = new CommonMessage(messageEmail);
		commonMessage1.sendMessage("加班申请", "王总");
		// 加急信息
		AbstractMessage urgencyMessage1 = new UrgencyMessage(messageEmail);
		urgencyMessage1.sendMessage("加班申请速批", "王总");
	}
}