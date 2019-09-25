package com.starfall.javase.javaio;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.javase.javaio
 * @className TestClient
 * @date 2019/9/23 17:05
 * @description todo
 */
public class TestClient {

	/**
	 * File 静态常量
	 */
	public void test1() {
		System.out.println(File.pathSeparator);
		System.out.println(File.pathSeparatorChar);
		System.out.println(File.separator);
		System.out.println(File.separatorChar);
	}

	/**
	 * File 构造方法
	 */
	public void test2() throws URISyntaxException {
		File file1 = new File("E:\\ext-3.4.0");
		System.out.println(file1.exists() + "\t" + file1.getPath());
		File file2 = new File("E:", "ext-3.4.0");
		System.out.println(file2.exists() + "\t" + file2.getPath());
		File file3 = new File(file2, "docs");
		System.out.println(file3.exists() + "\t" + file3.getPath());
		File file4 = new File(new URI("https://blog.csdn.net/zy934236179/article/details/82622030"));
		System.out.println(file4.exists() + "\t" + file4.getPath());
	}

	public static void main(String[] args) throws URISyntaxException {
		TestClient testClient = new TestClient();
		// testClient.test1();
		testClient.test2();
	}
}
