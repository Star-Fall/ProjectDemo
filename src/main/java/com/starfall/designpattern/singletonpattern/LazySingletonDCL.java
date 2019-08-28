package com.starfall.designpattern.singletonpattern;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.singletonpattern
 * @className LazySingletonDCL
 * @date 2019/8/28 15:31
 * @description 懒汉式——双检锁
 */
public class LazySingletonDCL {
	/**
	 * 静态私有成员变量
	 */
	private static volatile LazySingletonDCL instance = null;

	/**
	 * 私有构造方法
	 */
	private LazySingletonDCL() {

	}

	/**
	 * 公有的静态工厂方法
	 *
	 * @return 实例化对象
	 */
	public static LazySingletonDCL getInstance() {
		// 先检查实例是否存在，如果不存在才进入下面的同步块
		if (instance == null) {
			// 同步块
			synchronized (LazySingletonDCL.class) {
				// 再次检查实例是否存在，如果不存在才真正的创建实例
				if (instance == null) {
					// 测试多线程环境下单例模式 可删除
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					instance = new LazySingletonDCL();
				}
			}
		}
		return instance;
	}
}