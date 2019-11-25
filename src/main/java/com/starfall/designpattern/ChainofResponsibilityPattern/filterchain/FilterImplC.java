package com.starfall.designpattern.ChainofResponsibilityPattern.filterchain;

import java.util.Random;

/**
 * @author StarFall
 * @date 2019/11/25 22:40
 * @description 具体过滤器
 */
public class FilterImplC implements Filter {
    @Override
    public void doFilter(int request, FilterChain filterChain) {
        boolean result = (new Random().nextInt(10)) > 3;
        System.out.println(this.getClass().getName() + " 处理结果：" + result);
    }
}