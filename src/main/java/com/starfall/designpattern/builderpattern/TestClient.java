package com.starfall.designpattern.builderpattern;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.builderpattern
 * @className TestClient
 * @date 2019/8/26 16:17
 * @description TestClient 测试客户端
 */
public class TestClient {

	public static void main(String[] args) {
        Director director = new Director();
        Product product = director.buildProduct(new ConcreteBuilder());
        System.out.println(product);
	}
}
