package com.starfall.designpattern.builderpattern;

import java.util.Date;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.builderpattern
 * @className ConcreteBuilder
 * @date 2019/8/26 16:11
 * @description ConcreteBuilder 具体建造者
 */
public class ConcreteBuilder implements Builder {
	private Product product;

	public ConcreteBuilder() {
		product = new Product();
	}

	@Override
	public void buildProductName() {
		product.setProductName("产品名称");
		System.out.println("buildProductName: " + product.getProductName());
	}

	@Override
	public void buildProductPrice() {
		product.setProductPrice(100);
		System.out.println("buildProductPrice: " + product.getProductPrice());
	}

	@Override
	public void buildProductRemark() {
		product.setProductRemark("产品备注");
		System.out.println("buildProductRemark: " + product.getProductRemark());
	}

	@Override
	public void buildProductDate() {
		product.setProductDate(new Date());
		System.out.println("buildProductDate: " + product.getProductDate());
	}

	@Override
	public Product getProduct() {
		return product;
	}
}
