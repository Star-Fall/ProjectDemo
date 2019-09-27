package com.starfall.javase.javaio;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Enumeration;
import java.util.Properties;

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

	/**
	 * 文件属性读取相关
	 *
	 * @throws IOException
	 */
	public void test3() throws IOException {
		File file = new File("E:\\temp\\temp.txt");
		System.out.println("getName：\t" + file.getName());
		System.out.println("getParent：\t" + file.getParent());
		System.out.println("getParentFile：\t" + file.getParentFile());

		System.out.println("getPath：\t" + file.getPath());
		System.out.println("getAbsolutePath：\t" + file.getAbsolutePath());
		System.out.println("getAbsoluteFile：\t" + file.getAbsoluteFile());

		System.out.println("getCanonicalPath：\t" + file.getCanonicalPath());
		System.out.println("getCanonicalFile：\t" + file.getCanonicalFile());

		System.out.println("getTotalSpace：\t" + file.getTotalSpace());
		System.out.println("getFreeSpace：\t" + file.getFreeSpace());
		System.out.println("getUsableSpace：\t" + file.getUsableSpace());

		System.out.println("isAbsolute：\t" + file.isAbsolute());
		System.out.println("isFile：\t" + file.isFile());
		System.out.println("isDirectory：\t" + file.isDirectory());
		System.out.println("isHidden：\t" + file.isHidden());

		System.out.println("exists：\t" + file.exists());
		System.out.println("length：\t" + file.length());
		System.out.println("lastModified：\t" + file.lastModified());
	}

	/**
	 * 文件操作相关
	 */
	public void test4() throws IOException {
		File file = new File("E:\\temp\\1.txt");
		System.out.println(file.createNewFile());
		File tempFile = File.createTempFile("test", ".txt");
		System.out.println(tempFile.getPath());
		File tempFile1 = File.createTempFile("temp1", ".txt", new File("E:\\temp"));
		System.out.println(tempFile1.getPath());
		System.out.println(System.getProperty("java.io.tmpdir"));

		File file1 = new File(file.getPath());
		file1.renameTo(new File("E:\\temp\\1\\2.txt"));

		File file2 = new File("E:\\temp\\1\\2\\3");
		System.out.println(file2.mkdir());
		System.out.println(file2.mkdirs());

		File file3 = new File(tempFile.getPath());
		System.out.println(file3.delete());
		file3.deleteOnExit();
	}

	/**
	 * 文件列表读取
	 */
	public void test5() {
		File file = new File("E:\\temp");
		String[] list = file.list();
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("------------------------------------");

		File[] listFiles = file.listFiles();
		for (File listFile : listFiles) {
			System.out.println(listFile);
		}
		System.out.println("------------------------------------");

		File[] listFilterFiles = file.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				if (name.length() > 6) {
					return true;
				}
				return false;
			}
		});
		for (File listFilterFile : listFilterFiles) {
			System.out.println(listFilterFile);
		}
		System.out.println("------------------------------------");

		File[] listRoots = File.listRoots();
		for (File listRoot : listRoots) {
			System.out.println(listRoot);
		}
	}

	/**
	 * 文件权限相关
	 */
	public void test6() {
		File file = new File("E:\\temp\\1.txt");
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.canExecute());

		file.setReadOnly();
		file.setLastModified(1);
		file.setExecutable(true);
		file.setExecutable(true, true);
		file.setWritable(true);
		file.setWritable(true, true);
		file.setReadable(true);
		file.setReadable(true, true);
	}

	/**
	 * 其他操作
	 */
	public void test7() {
		File file = new File("E:\\temp\\1.txt");
		System.out.println(file.toPath());
		System.out.println(file.toString());
		System.out.println(file.toURI());
		System.out.println(file.compareTo(new File("")));
	}

	private void testSystemProperty() {
		Properties properties = System.getProperties();
		Enumeration<?> enumeration = properties.propertyNames();
		while (enumeration.hasMoreElements()) {
			String propertyName = (String) enumeration.nextElement();
			String propertyValue = properties.getProperty(propertyName);
			System.out.println(propertyName + " \t=\t " + propertyValue);
		}
	}

	public static void main(String[] args) throws URISyntaxException, IOException {
		TestClient testClient = new TestClient();
		// testClient.test1();
		// testClient.test2();
		// testClient.test3();
		// testClient.test4();
		// testClient.test5();
		// testClient.test6();
		testClient.test7();
	}
}
