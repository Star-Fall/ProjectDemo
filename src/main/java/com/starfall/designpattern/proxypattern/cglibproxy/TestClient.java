package com.starfall.designpattern.proxypattern.cglibproxy;

/**
 * @author StarFall
 * @date 2019/11/20 23:01
 * @description 代理模式——Cglib代理
 */
public class TestClient {
	public static void main(String[] args) {
		// 被代理类对象
		Subject subject = new Subject();
		// 使用Cglib代理工厂创建代理类
		Subject subjectProxy = (Subject) new ProxyFactory(subject).getProxyInstance();
		// 代理对象代理执行方法
		subjectProxy.request();
	}
}