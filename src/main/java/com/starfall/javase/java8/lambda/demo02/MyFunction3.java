package com.starfall.javase.java8.lambda.demo02;

import com.starfall.javase.java8.lambda.Student;

/**
 * @author StarFall
 * @date 2019/11/10 0:25
 * @description 有返回值
 */
@FunctionalInterface
public interface MyFunction3 {

	public boolean test(Student student);
}
