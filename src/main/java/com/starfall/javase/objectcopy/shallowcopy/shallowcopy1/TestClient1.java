package com.starfall.javase.objectcopy.shallowcopy.shallowcopy1;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.javase.objectcopy.shallowcopy.shallowcopy1
 * @className TestClient1
 * @date 2019/8/27 10:42
 * @description 拷贝构造方法 测试
 */
public class TestClient1 {

	public static void test(Object p1, Object p2) {
		System.out.println(System.identityHashCode(p1));
		System.out.println(System.identityHashCode(p2));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p1 == p2);
	}

	public static void main(String[] args) {
		// 定义成员变量
		int age = 20;
		String name = "Tom";
		Integer code = 100;
		Job job = new Job("服务员", 3000);

		// 根据成员变量创建对象
		Person p1 = new Person(age, name, code, job);
		// 拷贝构造方法实现浅拷贝
		Person p2 = new Person(p1);
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
