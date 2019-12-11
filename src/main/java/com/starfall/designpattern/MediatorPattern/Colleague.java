package com.starfall.designpattern.MediatorPattern;

/**
 * @author StarFall
 * @date 2019/12/3 22:14
 * @description 抽象同事类角色（Colleague）
 */
public abstract class Colleague {

    private Mediator mediator;

    public Colleague(Mediator mediator){
        this.mediator=mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }
}