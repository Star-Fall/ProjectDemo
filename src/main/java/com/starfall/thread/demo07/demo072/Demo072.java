package com.starfall.thread.demo07.demo072;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo07.demo072
 * @className Demo072
 * @date 2019/6/27 23:05
 * @description Demo072
 */
public class Demo072 {

	public static void main(String[] args) {
		try {
			WriteData writeData = new WriteData();
			ReadData readData = new ReadData();
			PipedInputStream inputStream = new PipedInputStream();
			PipedOutputStream outputStream = new PipedOutputStream();
			//outputStream.connect(inputStream);
			inputStream.connect(outputStream);
			ThreadWrite threadWrite = new ThreadWrite(writeData, outputStream);
			ThreadRead threadRead = new ThreadRead(readData, inputStream);
			threadRead.start();
			threadWrite.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
