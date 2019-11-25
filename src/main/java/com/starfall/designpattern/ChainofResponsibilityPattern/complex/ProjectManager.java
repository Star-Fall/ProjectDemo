package com.starfall.designpattern.ChainofResponsibilityPattern.complex;

import java.util.Random;

/**
 * @author StarFall
 * @date 2019/11/24 21:45
 * @description 项目经理审批
 */
public class ProjectManager extends Handler {
	@Override
	public boolean handler(int request) {
		// 项目经理审批：随机数大于3则为批准，否则不批准
		boolean result = (new Random().nextInt(10)) > 3;
		System.out.println("请假天数：" + request + "天，项目经理审批结果：" + result);
		if (request > 3 && result == true) {
			// 请假3天以上，项目经理同意后交由部门经理审批
			return getNextHandler().handler(request);
		}
		// 请假3天以内，项目经理直接审批
		return result;

	}
}