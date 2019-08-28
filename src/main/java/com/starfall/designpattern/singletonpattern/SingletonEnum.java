package com.starfall.designpattern.singletonpattern;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.singletonpattern
 * @className SingletonEnum
 * @date 2019/8/28 17:29
 * @description 基本枚举单例模式
 */
public enum SingletonEnum {
	/**
	 * 枚举对象，代表SingletonEnum的一个单例
	 */
	INSTANCE;

	/**
	 * 该实例的其他方法
	 */
	public void otherMethod() {
		// ...
	}

	/**
	 * 使用示例
	 */
	public void test() {
		SingletonEnum.INSTANCE.otherMethod();
	}
}
