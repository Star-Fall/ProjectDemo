package com.starfall.designpattern.bridgepattern;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.bridgepattern
 * @className ConcreteImplementor
 * @date 2019/9/6 16:58
 * @description 具体实现化角色（ConcreteImplementor），给出实现化角色接口的具体实现。
 */
public class ConcreteImplementor implements Implementor {

	@Override
	public void operationImpl() {
		System.out.println("具体实现化方法：operationImpl");
	}
}
