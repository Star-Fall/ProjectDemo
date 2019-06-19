package com.starfall.collection.demo01;

import java.util.*;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.collection
 * @className Demo01
 * @date 2019/6/17 15:08
 * @description Demo01
 */
public class Demo01 {

	public void test01() {
		Map<Bean01, Bean01> map = new TreeMap<>();
		map.put(new Bean01(), new Bean01());
	}

	public void test02() {
		Bean01 bean = new Bean01();
		Map<Bean01, Bean01> map = new TreeMap<>(bean);
		map.put(new Bean01(), new Bean01());
	}

	/**
	 * 使用keySet遍历
	 * 
	 * @param map
	 */
	public void test03(TreeMap<String, String> map) {
		// 遍历
		Set<String> keySet = map.keySet();
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			String value = map.get(key);
			System.out.println("K = " + key + " , V = " + value);
		}
		System.out.println("***************");
		for (String key : keySet) {
			String value = map.get(key);
			System.out.println("K = " + key + " , V = " + value);
		}
	}

	/**
	 * 使用values遍历
	 * 
	 * @param map
	 */
	public void test04(TreeMap<String, String> map) {
		Collection<String> values = map.values();
		Iterator<String> iterator = values.iterator();
		while (iterator.hasNext()) {
			String value = iterator.next();
			System.out.println("V = " + value);
		}
		System.out.println("***************");
		for (String value : values) {
			System.out.println("V = " + value);
		}
	}

	/**
	 * 使用entrySet遍历
	 * 
	 * @param map
	 */
	public void test05(TreeMap<String, String> map) {
		Set<Map.Entry<String, String>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = iterator.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("K = " + key + " , V = " + value);
		}
		System.out.println("***************");
		for (Map.Entry<String, String> entry : entrySet) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("K = " + key + " , V = " + value);
		}
	}

	/**
	 * 逆序遍历
	 * 
	 * @param map
	 */
	public void test06(TreeMap<String, String> map) {
		NavigableSet<String> keySet = map.descendingKeySet();
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			String value = map.get(key);
			System.out.println("K = " + key + " , V = " + value);
		}
		System.out.println("***************");
		for (String key : keySet) {
			String value = map.get(key);
			System.out.println("K = " + key + " , V = " + value);
		}
	}

	public void test062(TreeMap<String, String> map) {
		NavigableMap<String, String> map1 = map.descendingMap();
		Set<String> keySet = map1.keySet();
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			String value = map.get(key);
			System.out.println("K = " + key + " , V = " + value);
		}
	}

	public static void main(String[] args) {
		Demo01 demo01 = new Demo01();
		// demo01.test03();

		TreeMap<String, String> map = new TreeMap<>();
		map.put("a", "aa");
		map.put("b", "bb");
		map.put("c", "cc");
		map.put("d", "dd");
		demo01.test062(map);
	}

}
