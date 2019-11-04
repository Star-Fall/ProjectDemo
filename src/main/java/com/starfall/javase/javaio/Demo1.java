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

	/**
	 * 测试FileInputStream
	 */
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

	/**
	 * 测试ByteArrayInputStream
	 */
	public void test2() {
		byte[] ArrayLetters = { 0x61, 0x62, 0x63, 0x64, 0x65, 0x66, 0x67, 0x68, 0x69, 0x6A, 0x6B, 0x6C, 0x6D, 0x6E,
				0x6F, 0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 0x78, 0x79, 0x7A };
		String arryString = new String(ArrayLetters);
		System.out.println("ArrayLetters=" + arryString);
		// 创建ByteArrayInputStream字节流，内容是ArrayLetters数组
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(ArrayLetters);
		// 从字节流中读取5个字节
		for (int i = 0; i < 5; i++) {
			// 若能继续读取下一个字节，则读取下一个字节
			if (byteArrayInputStream.available() >= 0) {
				// 读取“字节流的下一个字节”
				int tmp = byteArrayInputStream.read();
				System.out.printf("%d : 0x%s\n", i, Integer.toHexString(tmp));
			}
		}
		// 若“该字节流”不支持标记功能，则直接退出
		if (!byteArrayInputStream.markSupported()) {
			System.out.println("make not supported!");
			return;
		}

		// 标记“字节流中下一个被读取的位置”。即--标记“0x66”，因为因为前面已经读取了5个字节，所以下一个被读取的位置是第6个字节”
		// (01), ByteArrayInputStream类的mark(0)函数中的“参数0”是没有实际意义的。
		// (02), mark()与reset()是配套的，reset()会将“字节流中下一个被读取的位置”重置为“mark()中所保存的位置”
		byteArrayInputStream.mark(0);
		// 跳过5个字节。跳过5个字节后，字节流中下一个被读取的值应该是“0x6B”。
		byteArrayInputStream.skip(5);
		// 从字节流中读取5个数据。即读取“0x6B, 0x6C, 0x6D, 0x6E, 0x6F”
		byte[] buf = new byte[5];
		byteArrayInputStream.read(buf, 0, 5);
		// 将buf转换为String字符串。“0x6B, 0x6C, 0x6D, 0x6E, 0x6F”对应字符是“klmno”
		String str1 = new String(buf);
		System.out.printf("str1=%s\n", str1);

		// 重置“字节流”：即，将“字节流中下一个被读取的位置”重置到“mark()所标记的位置”，即0x66。
		byteArrayInputStream.reset();
		// 从“重置后的字节流”中读取5个字节到buf中。即读取“0x66, 0x67, 0x68, 0x69, 0x6A”
		byteArrayInputStream.read(buf, 0, 5);
		// 将buf转换为String字符串。“0x66, 0x67, 0x68, 0x69, 0x6A”对应字符是“fghij”
		String str2 = new String(buf);
		System.out.printf("str2=%s\n", str2);
	}

	/**
	 * 测试BufferedInputStream
	 */
	public void test3() {

	}

	public static void main(String[] args) throws IOException {
		Demo1 demo1 = new Demo1();
		// demo1.test1();
		demo1.test2();
	}
}
