package com.starfall.designpattern.singletonpattern;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.singletonpattern
 * @className EnumSingleton
 * @date 2019/8/28 17:33
 * @description 单例枚举,与静态内部类结合
 */
public class EnumSingleton {
	/**
	 * 私有构造方法
	 */
	private EnumSingleton() {

	}

	/**
	 * 公有的静态工厂方法
	 * 
	 * @return 对外提供实例化对象
	 */
	public static EnumSingleton getInstance() {
		return InnerEnum.INSTANCE.getInstance();
	}

	private enum InnerEnum {
		/**
		 * 枚举对象
		 */
		INSTANCE;

		/**
		 * 声明类的单例
		 */
		private EnumSingleton enumSingleton = null;

		/**
		 * 创建枚举的时候实例化类
		 */
		private InnerEnum() {
			enumSingleton = new EnumSingleton();
		}

		/**
		 * 内部枚举提供类单例方法
		 * 
		 * @return 类的实例
		 */
		private EnumSingleton getInstance() {
			return enumSingleton;
		}
	}
}
