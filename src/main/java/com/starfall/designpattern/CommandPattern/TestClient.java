package com.starfall.designpattern.CommandPattern;

/**
 * @author StarFall
 * @date 2019/11/26 22:45
 * @description 命令模式——测试端
 */
public class TestClient {
	public static void main(String[] args) {
		// 创建接收者
		Receiver receiver = new Receiver();
		// 创建命令角色，指定接收者
		Command command = new ConcreteCommand(receiver);
		// 创建请求者，指定调用的命令
		Invoker invoker = new Invoker(command);
		// 请求者执行方法
		invoker.action();
	}
}