package com.starfall.designpattern.MediatorPattern;

/**
 * @author StarFall
 * @date 2019/12/3 23:28
 * @description 具体同事类角色（ConcreteColleague）
 */
public class ConcreteColleagueA extends Colleague {

	public ConcreteColleagueA(Mediator mediator) {
		super(mediator);
	}

	public void sendMsg(String message) {
		getMediator().sendMsg(this, message);
	}

	public void accept(String messgae) {
		System.out.println("同事A收到消息：" + messgae);
	}
}