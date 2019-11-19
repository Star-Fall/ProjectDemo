package com.starfall.designpattern.proxypattern.staticproxy;

/**
 * @author StarFall
 * @date 2019/11/19 22:23
 * @description 代理模式——静态代理测试端
 */
public class TestClient {

	public static void main(String[] args) {
		// 需要委托类（目标对象）的对象
		Subject subject = new RealSubject();
		// 代理类需要装载委托类的对象，才能代理执行委托类的功能
		Proxy proxy = new Proxy(subject);
		// 代理类代理执行目标对象的方法
		proxy.request();
	}
}
