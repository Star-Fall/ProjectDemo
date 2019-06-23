package com.starfall.collection.demo01;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.collection.demo01
 * @className LRUCache
 * @date 2019/6/23 11:21
 * @description LRUCache LRU缓存
 */
public class LRUCache<K, V> extends LinkedHashMap<K, V> {
	private int maxCapacity;

	public LRUCache() {
		super(16, 0.75f, true);
		this.maxCapacity = 16;
	}

	public LRUCache(int maxCapacity) {
		super(maxCapacity, 0.75f, true);
		this.maxCapacity = maxCapacity;
	}

	@Override
	protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
		return size() > maxCapacity;
	}
}
