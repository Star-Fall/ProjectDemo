package com.starfall.designpattern.compositepattern.transparent;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.compositepattern.transparent
 * @className TestClient
 * @date 2019/9/19 11:10
 * @description 透明组合模式测试端
 */
public class TestClient {

	public static void main(String[] args) {
		Component root = new Composite("目录");

		// 创建文件夹
		Component dirA = new Composite("文件夹A");
		Component dirB = new Composite("文件夹B");
		// 文件夹加入目录
		root.addChild(dirA);
		root.addChild(dirB);

		// 创建文件A中文件
		Component fileA1 = new Leaf("文件A1");
		Component fileA2 = new Leaf("文件A2");
		// 文件A1、文件A2加入文件夹A
		dirA.addChild(fileA1);
		dirA.addChild(fileA2);

		// 创建文件B中文件
		Component fileB1 = new Leaf("文件B1");
		Component fileB2 = new Leaf("文件B2");
		// 文件A1、文件A2加入文件夹A
		dirB.addChild(fileB1);
		dirB.addChild(fileB2);

		// 输出目录
		root.printStruct("");
	}
}