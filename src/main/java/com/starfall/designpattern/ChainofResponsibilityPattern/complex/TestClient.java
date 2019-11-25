package com.starfall.designpattern.ChainofResponsibilityPattern.complex;

/**
 * @author StarFall
 * @date 2019/11/24 21:27
 * @description 职责链模式测试端——不纯的职责链模式
 */
public class TestClient {

	public static void main(String[] args) {
		Handler projectManager = new ProjectManager();
		Handler departmentManager = new DepartmentManager();
		Handler generalManager = new GeneralManager();

		projectManager.setNextHandler(departmentManager);
		departmentManager.setNextHandler(generalManager);

		int[] requests = new int[] { 2, 4, 12 };
		for (int request : requests) {
			System.out.println("-----------------请假天数：" + request + "-----------------");
			boolean result = projectManager.handler(request);
			System.out.println("最终审批结果：" + result);
		}
	}
}