package com.starfall.designpattern.builderpattern;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.builderpattern
 * @className Builder
 * @date 2019/8/26 16:10
 * @description Builder 抽象建造者
 */
public interface Builder {

	public void buildProductName();

	public void buildProductPrice();

	public void buildProductRemark();

	public void buildProductDate();

	public Product getProduct();
}
