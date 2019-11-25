package com.starfall.designpattern.ChainofResponsibilityPattern.filterchain;

/**
 * @author StarFall
 * @date 2019/11/24 23:29
 * @description FilterChain测试端
 */
public class TestClient {
	public static void main(String[] args) {

		int[] requests = new int[] { 2, 5, 9 };
		for (int request : requests) {
			System.out.println("-----------------参数：" + request + "-----------------");
			FilterChain filterChain = new FilterChain();
			filterChain.addFilter(new FilterImplA());
			filterChain.addFilter(new FilterImplB());
			filterChain.addFilter(new FilterImplC());
			filterChain.doFilter(request, filterChain);
		}
	}
}