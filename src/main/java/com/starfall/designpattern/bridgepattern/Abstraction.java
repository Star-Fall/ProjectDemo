package com.starfall.designpattern.bridgepattern;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.bridgepattern
 * @className Abstraction
 * @date 2019/9/6 16:59
 * @description 抽象化(Abstraction)角色,抽象化给出的定义，并保存一个对实现化对象的引用。
 */
public abstract class Abstraction {

	/**
	 * 持有实现化角色
	 */
	private Implementor implementor;

	public Abstraction(Implementor implementor) {
		this.implementor = implementor;
	}

	/**
	 * 操作方法
	 */
	public void operation() {
        this.implementor.operationImpl();
	}
}
