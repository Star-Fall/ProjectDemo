package com.starfall.designpattern.flyweightpattern;

/**
 * @author StarFall
 * @date 2019/11/14 23:38
 * @description 抽象享元接口
 */
public interface Flyweight {

	/**
	 * 享元类公共的方法,用于设置外部状态
	 * 
	 * @param extrinsic
	 *            外部状态，通过传入外部参数改变
	 */
	public void operate(String extrinsic);
}
