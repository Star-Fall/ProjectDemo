package com.starfall.javase.javaio;

import java.io.*;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.javase.javaio
 * @className Demo1
 * @date 2019/9/29 17:54
 * @description InputStream 字节输入流
 */
public class Demo1 {

	public void test1() throws IOException {
		FileInputStream fileInputStream = new FileInputStream("E:\\temp\\1.txt");
		// 每次输入流读取的字节长度
		int len;
		// 定义字节数组，输入流每次最多读取1024字节到数组b中
		byte[] b = new byte[1024];
		while ((len = fileInputStream.read(b)) != -1) {
			System.out.print(new String(b, 0, len));
		}
		fileInputStream.close();
	}

	public static void main(String[] args) throws IOException {
		Demo1 demo1 = new Demo1();
		demo1.test1();
	}
}
