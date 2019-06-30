package com.starfall.collection.demo01;

import java.util.*;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.collection.demo01
 * @className Demo03
 * @date 2019/6/28 23:42
 * @description Demo03 HashSet
 */
public class Demo03 {

	public void test01(HashSet<String> set) {
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(next);
		}

		System.out.println("********");
		for (String s : set) {
			System.out.println(s);
		}
	}

	public void test02() {
		LinkedHashSet<String> set = new LinkedHashSet<>();
		set.add("");
	}

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("1");
		set.add("3");
		set.add("2");
		set.add("4");
		set.add("6");
		set.add("5");

		Demo03 demo03 = new Demo03();
		demo03.test01(set);
	}

}
