package com.starfall.designpattern.ChainofResponsibilityPattern.complex;

import java.util.Random;

/**
 * @author StarFall
 * @date 2019/11/24 21:57
 * @description 总经理审批
 */
public class GeneralManager extends Handler {
	@Override
	public boolean handler(int request) {
		// 总经理审批：随机数大于3则为批准，否则不批准
		boolean result = (new Random().nextInt(10)) > 3;
        System.out.println("请假天数：" + request + "天，总经理审批结果：" + result);
        // 请假7天以上，需要总经理审批
        return result;
	}
}