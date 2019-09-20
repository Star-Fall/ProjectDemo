package com.starfall.designpattern.decoratorpattern;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.decoratorpattern
 * @className ConcreteDecorator
 * @date 2019/9/20 17:00
 * @description 具体装饰者（ConcreteDecorator）
 */
public class ConcreteDecorator extends Decorator {

	public ConcreteDecorator(Component component) {
		super(component);
	}

	@Override
	public void method() {
		System.out.println("ConcreteDecorator具体装饰者：装饰的业务代码....");
		super.method();
	}

	@Override
	public void decoratorMethod() {
		System.out.println("装饰器增加的额外职责：ConcreteDecorator.decoratorMethod()");
	}
}
