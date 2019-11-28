package com.starfall.designpattern.IteratorPattern;

/**
 * @author StarFall
 * @date 2019/11/28 23:02
 * @description 抽象聚合类角色（Aggregate）
 */
public interface Aggregate<T> {

	/**
	 * 聚合对象添加元素
	 * 
	 * @param t
	 *            元素
	 */
	public void add(T t);

	/**
	 * 获取聚合对象size
	 * 
	 * @return size
	 */
	public int size();

	/**
	 * 根据索引返回元素
	 * 
	 * @param index
	 *            索引
	 * @return 元素
	 */
	public T get(int index);

	/**
	 * 获取聚合对象迭代器
	 * 
	 * @return 迭代器
	 */
	public Iterator<T> iterator();
}