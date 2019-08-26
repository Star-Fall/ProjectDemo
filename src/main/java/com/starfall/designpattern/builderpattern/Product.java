package com.starfall.designpattern.builderpattern;

import java.util.Date;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.builderpattern
 * @className Product
 * @date 2019/8/26 16:05
 * @description Product 产品角色
 */
public class Product {

	private String productName;
	private double productPrice;
	private String productRemark;
	private Date productDate;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductRemark() {
		return productRemark;
	}

	public void setProductRemark(String productRemark) {
		this.productRemark = productRemark;
	}

	public Date getProductDate() {
		return productDate;
	}

	public void setProductDate(Date productDate) {
		this.productDate = productDate;
	}

	@Override
	public String toString() {
		return "Product{" + "productName='" + productName + '\'' + ", productPrice=" + productPrice
				+ ", productRemark='" + productRemark + '\'' + ", productDate=" + productDate + '}';
	}
}