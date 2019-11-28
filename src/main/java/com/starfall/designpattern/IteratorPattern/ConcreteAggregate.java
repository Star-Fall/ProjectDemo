package com.starfall.designpattern.IteratorPattern;

/**
 * @author StarFall
 * @date 2019/11/28 23:14
 * @description 具体聚合类角色（ConcreteAggregate）
 */
public class ConcreteAggregate<T> implements Aggregate<T> {
	/**
	 * 聚合对象内部存储结构
	 */
	private Object[] array;

	/**
	 * 聚合对象内部索引位置
	 */
	private int position;

	ConcreteAggregate() {
		array = new Object[100];
		position = 0;
	}

	@Override
	public void add(T t) {
		array[position++] = t;
	}

	@Override
	public int size() {
		return position;
	}

	@Override
	public T get(int index) {
		return (T) array[index];
	}

	@Override
	public Iterator<T> iterator() {
		return new ConcreteIterator<T>(this);
	}
}