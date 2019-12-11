package com.starfall.javase.java8.stream.demo01;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author StarFall
 * @date 2019/12/5 21:45
 * @description Stream——创建流
 */
public class Demo01 {
	@Test
	public void test1() {
		// 数组创建流
		String[] array = {};
		Arrays.stream(array);
	}
}