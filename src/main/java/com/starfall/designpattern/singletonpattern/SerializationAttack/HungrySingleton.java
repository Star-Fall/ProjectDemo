package com.starfall.designpattern.singletonpattern.SerializationAttack;

import java.io.Serializable;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.singletonpattern.SerializationAttack
 * @className HungrySingleton
 * @date 2019/8/29 17:33
 * @description HungrySingleton 序列化攻击
 */
public class HungrySingleton implements Serializable {

	private static final long serialVersionUID = -3053485338819724717L;

	private static HungrySingleton instance = new HungrySingleton();

	private HungrySingleton() {

	}

	public static HungrySingleton getInstance() {
		if (instance == null) {
			instance = new HungrySingleton();
		}
		return instance;
	}
}
