package com.starfall.designpattern.proxypattern.cglibproxy;

/**
 * @author StarFall
 * @date 2019/11/20 23:05
 * @description 目标对象类，被代理类
 */
public class Subject {
	public void request() {
        System.out.println("目标对象类：request()");
	}
}