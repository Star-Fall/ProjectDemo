package com.starfall.designpattern.MediatorPattern;

/**
 * @author StarFall
 * @date 2019/12/3 23:33
 * @description 中介者模式——测试端
 */
public class TestClient {

    public static void main(String[] args) {
        Mediator mediator=new ConcreteMediator();

        ConcreteColleagueA concreteColleagueA=new ConcreteColleagueA(mediator);
        ConcreteColleagueB concreteColleagueB=new ConcreteColleagueB(mediator);

        ((ConcreteMediator) mediator).setConcreteColleagueA(concreteColleagueA);
        ((ConcreteMediator) mediator).setConcreteColleagueB(concreteColleagueB);

        concreteColleagueA.sendMsg("我是A");
        concreteColleagueB.sendMsg("I am B");
    }

}