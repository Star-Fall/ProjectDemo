package com.starfall.designpattern.ObserverPattern.JDKObserver;

/**
 * @author StarFall
 * @date 2019/12/11 23:28
 * @description 微信公众号推送文章测试
 */
public class TestClient {

	public static void main(String[] args) {
		// 创建微信公众号
		WeChatOfficialAccount officialAccount = new WeChatOfficialAccount("观察者模式");
		// 创建多个微信客户端
		WeChatClientAccount client1 = new WeChatClientAccount("A");
		WeChatClientAccount client2 = new WeChatClientAccount("B");
		WeChatClientAccount client3 = new WeChatClientAccount("C");

		// 公众号被用户订阅
		officialAccount.addObserver(client1);
		officialAccount.addObserver(client2);
		officialAccount.addObserver(client3);

		// 公众号发布推送
		officialAccount.publishArticle("观察者模式可以实现表示层和数据逻辑层的分离...");
	}
}