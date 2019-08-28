package com.starfall.designpattern.singletonpattern;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.singletonpattern
 * @className LazySingletonThreadSafe
 * @date 2019/8/28 15:25
 * @description 懒汉式——线程安全
 */
public class LazySingletonThreadSafe {

	/**
	 * 静态私有成员变量
	 */
	private static LazySingletonThreadSafe instance = null;

	/**
	 * 私有构造方法
	 */
	private LazySingletonThreadSafe() {

	}

	/**
	 * 公有的静态工厂方法
	 *
	 * @return 实例化对象
	 */
	public static synchronized LazySingletonThreadSafe getInstance() {
		if (instance == null) {
			// 测试多线程环境下单例模式 可删除
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			instance = new LazySingletonThreadSafe();
		}
		return instance;
	}
}
