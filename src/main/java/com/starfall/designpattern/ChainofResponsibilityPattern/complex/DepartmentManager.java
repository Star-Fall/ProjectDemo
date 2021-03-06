package com.starfall.designpattern.ChainofResponsibilityPattern.complex;

import java.util.Random;

/**
 * @author StarFall
 * @date 2019/11/24 21:55
 * @description 部门经理审批
 */
public class DepartmentManager extends Handler {
	@Override
	public boolean handler(int request) {
		// 部门经理审批：随机数大于3则为批准，否则不批准
		boolean result = (new Random().nextInt(10)) > 3;
		System.out.println("请假天数：" + request + "天，部门经理审批结果：" + result);
		if (request > 7 && result == true) {
			// 请假7天以上，部门经理同意后交由总经理审批
			return getNextHandler().handler(request);
		}
		// 请假7天以内，需要部门经理审批
		return result;
	}
}