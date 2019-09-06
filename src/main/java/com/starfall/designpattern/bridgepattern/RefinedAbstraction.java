package com.starfall.designpattern.bridgepattern;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.bridgepattern
 * @className RefinedAbstraction
 * @date 2019/9/6 17:01
 * @description 修正抽象化(RefinedAbstraction)角色,扩展抽象化角色，改变和修正父类对抽象化的定义。
 */
public class RefinedAbstraction extends Abstraction {

	public RefinedAbstraction(Implementor implementor) {
		super(implementor);
	}

	/**
	 * 其他的操作方法
	 */
	public void otherOperation() {
		System.out.println("其他的操作方法：otherOperation");
	}
}
