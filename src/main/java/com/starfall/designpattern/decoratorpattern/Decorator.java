package com.starfall.designpattern.decoratorpattern;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.decoratorpattern
 * @className Decorator
 * @date 2019/9/20 16:56
 * @description 抽象装饰者（Decorator）
 */
public abstract class Decorator implements Component {
	/**
	 * 抽象构件角色
	 */
	private Component component;

	public Decorator(Component component) {
		this.component = component;
	}

	@Override
	public void method() {
		// 装饰器委派给构件角色
		this.component.method();
	}

	/**
	 * 装饰器增加的额外职责
	 */
	public abstract void decoratorMethod();
}
