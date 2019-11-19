package com.starfall.designpattern.proxypattern.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author StarFall
 * @date 2019/11/19 23:24
 * @description 动态代理类
 */
public class DynamicProxy implements InvocationHandler {

	/**
	 * 持有目标对象
	 */
	private Object object;

	public DynamicProxy(Object object) {
		this.object = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		this.before();
		method.invoke(object, args);
		this.after();
		return null;
	}

	private void before() {
		System.out.println("-------DynamicProxy before-------");
	}

	private void after() {
		System.out.println("-------DynamicProxy after-------");
	}
}