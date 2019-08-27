package com.starfall.javase.objectcopy.deepcopy.deepcopy1;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.javase.objectcopy.deepcopy.deepcopy1
 * @className TestClient
 * @date 2019/8/27 15:09
 * @description 重写clone()方法 实现深拷贝
 */
public class TestClient {
	public static void main(String[] args) {
		// 定义成员变量
		int age = 20;
		String name = "Tom";
		Integer code = 100;
		Job job = new Job("服务员", 3000);

		// 根据成员变量创建对象
		Person p1 = new Person(age, name, code, job);
		// clone方法拷贝对象
		Person p2 = p1.clone();
		System.out.println("p1 = " + p1);
		System.out.println("p2 = " + p2);

		// 修改p1的各属性值，观察p2的各属性值是否跟随变化
		age = 22;
		name = "Jerry";
		code = 200;
		job.setJobName("厨师");
		System.out.println("修改后p1 = " + p1);
		System.out.println("修改后p2 = " + p2);
	}
}
