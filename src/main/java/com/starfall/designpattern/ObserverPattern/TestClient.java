package com.starfall.designpattern.ObserverPattern;

/**
 * @author StarFall
 * @date 2019/12/10 22:34
 * @description 观察者模式——测试端
 */
public class TestClient {
	public static void main(String[] args) {
		//创建目标角色
		Subject subject=new ConcreteSubject();

		//创建多个观察者
		Observer observerA=new ConcreteObserver("ObserverA");
		Observer observerB=new ConcreteObserver("ObserverB");
		Observer observerC=new ConcreteObserver("ObserverC");

		//目标角色添加观察者
		subject.subscribe(observerA);
		subject.subscribe(observerB);
		subject.subscribe(observerC);

		//目标角色状态变化
		((ConcreteSubject) subject).change("New Status");
		
		System.out.println("********************************");
		
		//目标角色去除观察者
		subject.unsubscribe(observerA);
		//目标角色继续变化
		((ConcreteSubject) subject).change("Other Status");
	}
}