package com.starfall.designpattern.flyweightpattern;

/**
 * @author StarFall
 * @date 2019/11/15 23:38
 * @description 非共享具体享元类
 */
public class UnsharedConcreteFlyweight implements Flyweight {

	/**
	 * 内部状态
	 */
	private String intrinsic;

	/**
	 * 内部状态通过构造方法指定
	 * 
	 * @param intrinsic
	 *            内部状态
	 */
	public UnsharedConcreteFlyweight(String intrinsic) {
		this.intrinsic = intrinsic;
	}

	/**
	 * 享元类公共的方法,用于设置外部状态
	 *
	 * @param extrinsic
	 *            外部状态，通过传入外部参数改变
	 */
	@Override
	public void operate(String extrinsic) {
		System.out.println("非共享具体享元类operate方法：**********begin**********");
		System.out.println("内部状态：" + intrinsic);
		System.out.println("外部状态：" + extrinsic);
        System.out.println("非共享具体享元类operate方法：**********end**********");
	}
}