package com.starfall.designpattern.singletonpattern.SerializationAttack;

import java.io.Serializable;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.singletonpattern.SerializationAttack
 * @className HungrySingletonSafe
 * @date 2019/8/29 17:57
 * @description HungrySingletonSafe
 */
public class HungrySingletonSafe implements Serializable {

	private static final long serialVersionUID = 6138839291819049572L;

	private static HungrySingletonSafe instance = new HungrySingletonSafe();

	private HungrySingletonSafe() {

	}

	/**
	 * 在序列化时候，代替readObject方法反序列化返回的对象。从而保护性恢复单例，保证单例。
	 *
	 * @return
	 */
	private Object readResolve() {
		return instance;
	}

	public static HungrySingletonSafe getInstance() {
		if (instance == null) {
			instance = new HungrySingletonSafe();
		}
		return instance;
	}
}
