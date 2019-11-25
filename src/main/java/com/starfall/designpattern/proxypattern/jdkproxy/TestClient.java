package com.starfall.designpattern.proxypattern.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author StarFall
 * @date 2019/11/19 23:27
 * @description 代理模式——JDK动态代理
 */
public class TestClient {

	public static void main(String[] args) {
		// 需要一个目标对象
		Subject subject = new RealSubject();
		System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		// 动态代理类装载目标对象
		InvocationHandler handler = new DynamicProxy(subject);
		// 使用Proxy创建目标对象的代理对象
		Subject subjectProxy = (Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader(),
				subject.getClass().getInterfaces(), handler);
		// 使用代理对象代理调用方法
		subjectProxy.request();
	}
}