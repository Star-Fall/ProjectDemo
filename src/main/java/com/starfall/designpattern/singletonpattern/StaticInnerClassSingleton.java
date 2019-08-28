package com.starfall.designpattern.singletonpattern;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.singletonpattern
 * @className StaticInnerClassSingleton
 * @date 2019/8/28 17:04
 * @description 静态内部类模式
 */
public class StaticInnerClassSingleton {
	/**
	 * 私有构造方法
	 */
	private StaticInnerClassSingleton() {

	}

	/**
	 * 静态内部类
	 */
	private static class SingletonHolder {
		private final static StaticInnerClassSingleton singleton = new StaticInnerClassSingleton();
	}

	/**
	 * 公有的静态工厂方法
	 * 
	 * @return 返回内部类中的实例化对象
	 */
	public static StaticInnerClassSingleton getInstance() {
		return SingletonHolder.singleton;
	}
}
