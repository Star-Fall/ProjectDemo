package com.starfall.designpattern.adapterpattern.ClassAdapter;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.adapterpattern.ClassAdapter
 * @className TestClient
 * @date 2019/9/4 14:17
 * @description 测试客户端
 */
public class TestClient {

	public static void main(String[] args) {
		Target target = new Adapter();
		target.tagertMethod();
	}
}
