package com.starfall.collection.demo01;

import java.util.*;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.collection.demo01
 * @className Demo02
 * @date 2019/6/20 10:59
 * @description Demo02 LinkedHashMap
 */
public class Demo02 {

	public void test01(LinkedHashMap<String, String> map) {
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			String value = map.get(key);
			System.out.println("K = " + key + " , V = " + value);
		}
	}

	public void test02() {
		LRUCache<String, String> cache = new LRUCache<>(4);
		cache.put("1", "11");
		cache.put("2", "22");
		cache.put("3", "33");
		cache.put("4", "44");

		// test01(cache);
		iteratorCache(cache);
		cache.put("5", "55");
		iteratorCache(cache);
		cache.get("2");
		iteratorCache(cache);
		cache.get("3");
		iteratorCache(cache);
	}

	private void iteratorCache(LRUCache<String, String> cache) {
		Set<Map.Entry<String, String>> entries = cache.entrySet();
		Iterator<Map.Entry<String, String>> iterator = entries.iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = iterator.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.print("K = " + key + " , V = " + value + "\t");
		}
		System.out.println();
	}

	public void test03() {
		LRUCache<String, String> cache = new LRUCache<>(4);
		cache.put("1", "11");
		cache.put("2", "22");
		cache.put("3", "33");
		cache.put("4", "44");
		Set<String> keySet = cache.keySet();
		for (String key : keySet) {
			String value = cache.get(key);
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
		demo02.test02();
		// demo02.test03();
	}

}
