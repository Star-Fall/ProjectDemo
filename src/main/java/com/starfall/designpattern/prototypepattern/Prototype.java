package com.starfall.designpattern.prototypepattern;

import java.util.ArrayList;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.prototypepattern
 * @className Prototype
 * @date 2019/8/27 17:15
 * @description Prototype抽象原型类
 */
public abstract class Prototype implements Cloneable {

	@Override
	public Object clone() {
		Object object = null;
		try {
			object = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return object;
	}
}
