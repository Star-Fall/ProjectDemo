package com.starfall.designpattern.proxypattern.staticproxy;

/**
 * @author StarFall
 * @date 2019/11/19 22:38
 * @description 目标对象角色
 */
public class RealSubject implements Subject{
    /**
     * 目标对象方法
     */
    @Override
    public void request() {
        System.out.println("RealSubject（目标对象角色）的方法request()");
    }
}