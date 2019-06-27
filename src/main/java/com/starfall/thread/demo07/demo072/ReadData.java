package com.starfall.thread.demo07.demo072;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedReader;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo07.demo072
 * @className ReadData
 * @date 2019/6/27 22:52
 * @description ReadData
 */
public class ReadData {

	public void readMethod(PipedInputStream inputStream) {
		try {
			System.out.println("read start：");
			byte[] byteArray = new byte[20];
			int readLength = inputStream.read(byteArray);
			while (readLength != -1) {
				String data = new String(byteArray, 0, readLength);
				System.out.print(data);
				readLength = inputStream.read(byteArray);
			}
			System.out.println();
			inputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void readMethod(PipedReader inputStream) {
		try {
			System.out.println("read start：");
			char[] byteArray = new char[20];
			int readLength = inputStream.read(byteArray);
			while (readLength != -1) {
				String data = new String(byteArray, 0, readLength);
				System.out.print(data);
				readLength = inputStream.read(byteArray);
			}
			System.out.println();
			inputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
