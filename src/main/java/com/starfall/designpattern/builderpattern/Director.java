package com.starfall.designpattern.builderpattern;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.builderpattern
 * @className Director
 * @date 2019/8/26 16:16
 * @description Director 指挥者
 */
public class Director {

	public Product buildProduct(Builder builder) {
		builder.buildProductDate();
		builder.buildProductName();
		builder.buildProductPrice();
		builder.buildProductRemark();
		return builder.getProduct();
	}
}