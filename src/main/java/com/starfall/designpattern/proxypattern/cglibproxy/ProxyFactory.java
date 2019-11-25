package com.starfall.designpattern.proxypattern.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author StarFall
 * @date 2019/11/20 23:06
 * @description Cglib代理工厂
 */
public class ProxyFactory implements MethodInterceptor {
	/**
	 * 持有目标对象
	 */
	private Object target;

	public ProxyFactory(Object object) {
		this.target = object;
	}

	@Override
	public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		System.out.println("---------ProxyFactory before-----------");
		Object returnValue = method.invoke(target, args);
		System.out.println("---------ProxyFactory after-----------");
		return returnValue;

	}

	// 给目标对象创建一个代理对象
	public Object getProxyInstance() {
		// 1.工具类
		Enhancer en = new Enhancer();
		// 2.设置父类
		en.setSuperclass(target.getClass());
		// 3.设置回调函数
		en.setCallback(this);
		// 4.创建子类(代理对象)
		return en.create();

	}
}