package com.starfall.test.demo01;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.test.demo01
 * @className GenTest
 * @date 2019/7/19 23:26
 * @description GenTest 泛型数组测试
 */
public class GenTest<T> {

	private T[] array;

	public GenTest() {
		array = (T[]) new Object[10];
	}

	public void put(int index, T item) {
		array[index] = item;
	}

	public T get(int index) {
		return array[index];
	}

	public T[] rep() {
		return array;
	}

	public static void main(String[] args) {
		GenTest<String> gen = new GenTest<>();
		gen.put(0, "12");
		String value = gen.get(0);
		System.out.println(value);
		// 调用 rep()方法的时候，就报 ClassCastException 异常了，因为 Object[] 无法转型为 String[]。
		String[] rep = gen.rep();
		System.out.println(rep);
	}
}
