package com.starfall.collection.demo01;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.collection
 * @className Demo01
 * @date 2019/6/17 15:08
 * @description todo
 */
public class Demo01 {

	public void test01() {
		Map<Bean01, Bean01> map = new TreeMap<>();
		map.put(new Bean01(),new Bean01());
	}

	public static void main(String[] args) {
		Demo01 demo01 = new Demo01();
		demo01.test01();
	}
}
