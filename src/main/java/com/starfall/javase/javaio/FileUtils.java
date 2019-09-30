package com.starfall.javase.javaio;

import java.io.File;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.javase.javaio
 * @className FileUtils
 * @date 2019/9/29 10:05
 * @description 文件工具
 */
public class FileUtils {

	/**
	 * 删除文件或目录
	 * 
	 * @param path
	 *            路径
	 * @return 删除结果
	 */
	public static boolean deleteFileOrDirectory(String path) {
		return delete(new File(path));
	}

	/**
	 * 递归删除文件夹及其子文件
	 * 
	 * @param file
	 *            文件
	 * @return 删除结果
	 */
	private static boolean delete(File file) {
		if (file == null || !file.exists()) {
			return false;
		}
		if (file.isDirectory()) {
			File[] listFiles = file.listFiles();
			for (File listFile : listFiles) {
				delete(listFile);
			}
			return file.delete();
		} else {
			return file.delete();
		}
	}
}
