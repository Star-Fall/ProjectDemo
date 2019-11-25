package com.starfall.designpattern.ChainofResponsibilityPattern.filterchain;

/**
 * @author StarFall
 * @date 2019/11/24 23:15
 * @description Filter 过滤器接口
 */
public interface Filter {
	/**
	 * doFilter方法
	 * 
	 * @param request
	 *            参数
	 * @param filterChain
	 *            FilterChain
	 */
	public void doFilter(int request, FilterChain filterChain);
}