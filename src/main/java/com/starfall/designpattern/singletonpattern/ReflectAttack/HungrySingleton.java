package com.starfall.designpattern.singletonpattern.ReflectAttack;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.singletonpattern.ReflectAttack
 * @className HungrySingleton
 * @date 2019/9/3 15:28
 * @description HungrySingleton 反射攻击
 */
public class HungrySingleton {
	/**
	 * 静态私有成员变量
	 */
	private static HungrySingleton instance = new HungrySingleton();

	/**
	 * 私有构造方法
	 */
	private HungrySingleton() {

	}

	/**
	 * 公有的静态工厂方法
	 *
	 * @return 实例化对象
	 */
	public static HungrySingleton getInstance() {
		if (instance == null) {
			instance = new HungrySingleton();
		}
		return instance;
	}
}
