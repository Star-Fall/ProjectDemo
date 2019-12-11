package com.starfall.designpattern.ObserverPattern.JDKObserver;

import java.util.Observable;

/**
 * @author StarFall
 * @date 2019/12/11 23:11
 * @description 微信公众号类
 */
public class WeChatOfficialAccount extends Observable {

    /**
     * 文章
     */
    private String article;
    /**
     * 账号名称
     */
    private String accountName;

    public WeChatOfficialAccount(String accountName) {
        this.accountName = accountName;
    }

    /**
     * 发布文章
     *
     * @param article 文章
     */
    public void publishArticle(String article) {
        System.out.println("公众号【" +accountName+ "】发布文章：" + "{" + article + "}");
        this.article = article;
        // 设置内部状态，表明数据发生变化
        this.setChanged();
        // 通知客户端账号更新文章
        this.notifyObservers(article);
    }
}
