package com.starfall.designpattern.MediatorPattern;

/**
 * @author StarFall
 * @date 2019/12/3 22:33
 * @description 具体中介者角色（ConcreteMediator）
 */
public class ConcreteMediator implements Mediator {

	private ConcreteColleagueA concreteColleagueA;
	private ConcreteColleagueB concreteColleagueB;

	public void setConcreteColleagueA(ConcreteColleagueA concreteColleagueA) {
		this.concreteColleagueA = concreteColleagueA;
	}

	public void setConcreteColleagueB(ConcreteColleagueB concreteColleagueB) {
		this.concreteColleagueB = concreteColleagueB;
	}

	@Override
	public void sendMsg(Colleague colleague, String message) {
		if (concreteColleagueA == colleague) {
			concreteColleagueB.accept(message);
		} else {
			concreteColleagueA.accept(message);
		}
	}
}