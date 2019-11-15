package com.starfall.designpattern.flyweightpattern;

import java.util.HashMap;

/**
 * @author StarFall
 * @date 2019/11/15 23:40
 * @description 享元工厂类
 */
public class FlyweightFactory {

	/**
	 * 存放享元对象的池容器
	 */
	private static HashMap<String, Flyweight> pool = new HashMap<String, Flyweight>();

	/**
	 * 享元工厂方法，根据内部状态取出享元对象
	 *
	 * @param intrinsic
	 *            内部状态
	 * @return 享元对象Flyweight
	 */
	public static Flyweight getFlyweight(String intrinsic) {
		Flyweight flyweight = null;

		if (pool.containsKey(intrinsic)) {
			flyweight = pool.get(intrinsic);
			System.out.println("已有 " + intrinsic + " 直接从池中取---->内部状态：" + intrinsic);
		} else {
			flyweight = new ConcreteFlyweight(intrinsic);
			pool.put(intrinsic, flyweight);
			System.out.println("创建 " + intrinsic + " 然后 放入池中---->内部状态：" + intrinsic);
		}
		return flyweight;
	}

}
