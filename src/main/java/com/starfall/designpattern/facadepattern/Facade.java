package com.starfall.designpattern.facadepattern;

/**
 * @author StarFall
 * @date 2019/11/13 23:52
 * @description 外观角色（Facade）
 */
public class Facade {

	public void method() {
		ModuleA moduleA = new ModuleA();
		moduleA.methodA();
		ModuleB moduleB = new ModuleB();
		moduleB.methodB();
	}
}
