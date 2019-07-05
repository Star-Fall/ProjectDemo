package com.starfall.thread.demo10;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo10
 * @className Tools
 * @date 2019/7/4 23:47
 * @description Tools
 */
public class Tools {
	public static ThreadLocal<String> threadLocal = new ThreadLocal<>();
	public static InheritableThreadLocal<String> inheritableThreadLocal = new InheritableThreadLocal<>();
}
