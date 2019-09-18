package com.starfall.designpattern.compositepattern;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.compositepattern
 * @className TestClient
 * @date 2019/9/18 18:22
 * @description 测试端
 */
public class TestClient {

	public static void main(String[] args) {
		Component root = new Composite("目录");

		// 创建文件夹
		Component dir1 = new Composite("文件夹1");
		Component dir2 = new Composite("文件夹2");
		// 文件夹加入目录
		((Composite) root).addChild(dir1);
		((Composite) root).addChild(dir2);

		// 创建文件1文件2
		Component file1 = new Leaf("文件1");
		Component file2 = new Leaf("文件2");
		// 文件1、文件2加入文件夹1
		((Composite) dir1).addChild(file1);
		((Composite) dir1).addChild(file2);

		// 创建文件3文件4
		Component file3 = new Leaf("文件3");
		Component file4 = new Leaf("文件4");
		// 文件3、文件4加入文件夹2
		((Composite) dir2).addChild(file3);
		((Composite) dir2).addChild(file4);

		// 输出目录
		root.printStruct("");
	}
}
