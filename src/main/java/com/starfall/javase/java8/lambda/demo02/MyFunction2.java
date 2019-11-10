package com.starfall.javase.java8.lambda.demo02;

import com.starfall.javase.java8.lambda.Student;

/**
 * @author StarFall
 * @date 2019/11/10 0:07
 * @description 有参，无返回值
 */
@FunctionalInterface
public interface MyFunction2 {
	public void test(Student student);
}
