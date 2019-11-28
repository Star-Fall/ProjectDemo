package com.starfall.designpattern.CommandPattern;

/**
 * @author StarFall
 * @date 2019/11/26 23:10
 * @description 具体命令角色（ConcreteCommand）
 */
public class ConcreteCommand implements Command {

	/**
	 * 持有接收者对象的引用
	 */
	private Receiver receiver;

	public ConcreteCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	/**
	 * 具体的执行方法
	 */
	@Override
	public void execute() {
		System.out.println("具体的命令执行方法中，调用接收者的行动方法action");
		receiver.action();
	}
}