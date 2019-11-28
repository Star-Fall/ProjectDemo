package com.starfall.designpattern.IteratorPattern;

/**
 * @author StarFall
 * @date 2019/11/28 22:56
 * @description 具体迭代器角色（ConcreteIterator）
 */
public class ConcreteIterator<T> implements Iterator<T> {

	/**
	 * 聚合对象引用
	 */
	private Aggregate<T> aggregate;

	/**
	 * 聚合对象游标索引
	 */
	private int cursor;

	public ConcreteIterator(Aggregate<T> aggregate) {
		this.aggregate = aggregate;
		cursor = 0;
	}

	@Override
	public T next() {
		return aggregate.get(cursor++);
	}

	@Override
	public boolean hasNext() {
		return cursor < aggregate.size();
	}
}