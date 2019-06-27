package com.starfall.thread.demo07.demo072;

import java.io.IOException;
import java.io.PipedOutputStream;
import java.io.PipedWriter;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo07.demo072
 * @className WriteData
 * @date 2019/6/27 22:49
 * @description WriteData
 */
public class WriteData {
	public void writeMethod(PipedOutputStream outputStream) {
		try {
			System.out.println("write start：");
			for (int i = 0; i < 10; i++) {
				String data = "" + i;
				outputStream.write(data.getBytes());
				System.out.print(data);
			}
			System.out.println();
			outputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void writeMethod(PipedWriter outputStream) {
		try {
			System.out.println("write start：");
			for (int i = 0; i < 10; i++) {
				String data = "" + i;
				outputStream.write(data);
				System.out.print(data);
			}
			System.out.println();
			outputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
