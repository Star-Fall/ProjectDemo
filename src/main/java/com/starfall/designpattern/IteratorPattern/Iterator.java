package com.starfall.designpattern.IteratorPattern;

/**
 * @author StarFall
 * @date 2019/11/28 22:50
 * @description 抽象迭代器角色（Iterator）
 */
public interface Iterator<T> {
	/**
	 * 获取下一个元素
	 *
	 * @return 元素
	 */
	public T next();

	/**
	 * 判断是否有下一个元素
	 *
	 * @return 判断结果
	 */
	public boolean hasNext();
}