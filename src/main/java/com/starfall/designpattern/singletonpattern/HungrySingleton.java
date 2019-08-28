package com.starfall.designpattern.singletonpattern;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.singletonpattern
 * @className HungrySingleton
 * @date 2019/8/28 14:34
 * @description 饿汉式
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
			// 测试多线程环境下单例模式 可删除
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			instance = new HungrySingleton();
		}
		return instance;
	}
}
