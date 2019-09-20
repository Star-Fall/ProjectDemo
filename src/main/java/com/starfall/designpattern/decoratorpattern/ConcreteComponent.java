package com.starfall.designpattern.decoratorpattern;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.decoratorpattern
 * @className ConcreteComponent
 * @date 2019/9/20 16:25
 * @description 具体构件（ConcreteComponent）
 */
public class ConcreteComponent implements Component {
	@Override
	public void method() {
		System.out.println("ConcreteComponent具体构件：编写相关的业务代码...");
	}
}
