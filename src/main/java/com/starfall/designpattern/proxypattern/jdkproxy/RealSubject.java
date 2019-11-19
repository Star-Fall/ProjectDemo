package com.starfall.designpattern.proxypattern.jdkproxy;

/**
 * @author StarFall
 * @date 2019/11/19 23:23
 * @description 委托类（目标对象），需要被代理类代理执行的对象
 */
public class RealSubject implements Subject {
    /**
     * 目标对象方法
     */
    @Override
    public void request() {
        System.out.println("RealSubject（目标对象角色）的方法request()");
    }
}