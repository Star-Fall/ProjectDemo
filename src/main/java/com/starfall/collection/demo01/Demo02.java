package com.starfall.collection.demo01;

import java.util.*;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.collection.demo01
 * @className Demo02
 * @date 2019/6/20 10:59
 * @description Demo02
 */
public class Demo02 {

	public void test01(LinkedHashMap<String, String> map) {
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			String value = map.get(key);
			System.out.println("K = " + key + " , V = " + value);
		}
	}

	public static void main(String[] args) {
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put("1", "11");
		map.put("2", "22");
		map.put("3", "33");
		map.put("4", "44");
		map.put("5", "55");
		map.put("6", "66");
		Demo02 demo02 = new Demo02();
		demo02.test01(map);
	}

}
