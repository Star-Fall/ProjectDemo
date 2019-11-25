package com.starfall.designpattern.ChainofResponsibilityPattern.filterchain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author StarFall
 * @date 2019/11/24 23:16
 * @description 过滤器链
 */
public class FilterChain implements Filter {
	private int count = 0;
	private List<Filter> filters;

	public void addFilter(Filter filter) {
		if (filters == null) {
			filters = new ArrayList<>();
		}
		filters.add(filter);
	}

	@Override
	public void doFilter(int request, FilterChain filterChain) {
		if (filters == null) {
			return;
		}
		if (count == filters.size()) {
			return;
		}
		filters.get(count++).doFilter(request, filterChain);
	}
}