package com.starfall.designpattern.ObserverPattern.JDKObserver;

import java.util.Observable;
import java.util.Observer;

/**
 * @author StarFall
 * @date 2019/12/11 23:20
 * @description 微信客户端账号类
 */
public class WeChatClientAccount implements Observer {
	/**
	 * 文章
	 */
	private String article;
	/**
	 * 微信账号名称
	 */
	private String accountName;

	public WeChatClientAccount(String accountName) {
		this.accountName = accountName;
	}

	/**
	 * 客户端接收并更新内部文章
	 * 
	 * @param observable
	 *            公众号
	 * @param arg
	 *            更新数据
	 */
	@Override
	public void update(Observable observable, Object arg) {
		article = (String) arg;
		readArticle();
	}

	/**
	 * 阅读文章
	 */
	public void readArticle() {
		System.out.println("微信用户【" + accountName + "】阅读文章：" + article);
	}
}