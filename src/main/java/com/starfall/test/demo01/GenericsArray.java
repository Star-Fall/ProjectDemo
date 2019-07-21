package com.starfall.test.demo01;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.test.demo01
 * @className GenericsArray
 * @date 2019/7/21 23:33
 * @description GenericsArray
 */
public class GenericsArray<T> {
	private Object[] elementData;
	private int size = 0;

	public GenericsArray() {
		elementData = new Object[10];
	}

	public void add(T e) {
		elementData[size++] = e;
	}

	public T get(int index) {
		return (T) elementData[index];
	}

	public T[] rep() {
		return (T[]) elementData;
	}

	public static void main(String[] args) {
		GenericsArray<String> gen = new GenericsArray<>();
		gen.add("12");
		String value = gen.get(0);
		System.out.println(value);
		// 调用 rep()方法的时候，就报 ClassCastException 异常了，因为 Object[] 无法转型为 String[]。
		String[] rep = gen.rep();
		System.out.println(rep);
	}
}
