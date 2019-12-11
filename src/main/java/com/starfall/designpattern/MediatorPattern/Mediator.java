package com.starfall.designpattern.MediatorPattern;

/**
 * @author StarFall
 * @date 2019/12/3 22:11
 * @description 抽象中介者角色（Mediator）
 */
public interface Mediator {

    public void sendMsg(Colleague colleague,String message);

}