package com.starfall.designpattern.decoratorpattern;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.decoratorpattern
 * @className TestClient
 * @date 2019/9/20 17:09
 * @description 测试端
 */
public class TestClient {
	public static void main(String[] args) {
		Component component = new ConcreteComponent();
		System.out.println("*************装饰之前***************");
		component.method();
		System.out.println("*************装饰之后***************");
		Component componentDecorator = new ConcreteDecorator(component);
		componentDecorator.method();
		System.out.println("*************装饰额外的职责***************");
		((ConcreteDecorator) componentDecorator).decoratorMethod();
	}
}
