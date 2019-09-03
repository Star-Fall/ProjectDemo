package com.starfall.designpattern.singletonpattern.ReflectAttack;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.singletonpattern.ReflectAttack
 * @className HungrySingletonSafe
 * @date 2019/9/3 15:40
 * @description 饿汉式解决反射攻击
 */
public class HungrySingletonSafe {
	/**
	 * 静态私有成员变量
	 */
	private static HungrySingletonSafe instance = new HungrySingletonSafe();

	/**
	 * 私有构造方法
	 */
	private HungrySingletonSafe() {
		if (instance != null) {
			throw new RuntimeException("单例模式禁止反射调用！");
		}
	}

	/**
	 * 公有的静态工厂方法
	 *
	 * @return 实例化对象
	 */
	public static HungrySingletonSafe getInstance() {
		if (instance == null) {
			instance = new HungrySingletonSafe();
		}
		return instance;
	}
}
