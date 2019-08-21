package com.starfall.designpattern.abstractfactory;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.abstractfactory
 * @className TestClient
 * @date 2019/8/21 16:06
 * @description TestClient 测试客户端
 */
public class TestClient {

	public static void main(String[] args) {
		// 海尔工厂，生产TV和Fridge
		Factory factoryHaier = new FactoryHaier();
		ProductTV haierTV = factoryHaier.getProductTV();
		haierTV.buyProductTV();
		ProductFridge haierFridge = factoryHaier.getProductFridge();
		haierFridge.buyProductFridge();

		System.out.println("***************************");

		// 海信工厂，生产TV和Fridge
		Factory factoryHisense = new FactoryHisense();
		ProductTV hisenseTV = factoryHisense.getProductTV();
		hisenseTV.buyProductTV();
		ProductFridge hisenseFridge = factoryHisense.getProductFridge();
		hisenseFridge.buyProductFridge();
	}
}
