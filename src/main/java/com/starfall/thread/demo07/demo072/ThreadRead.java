package com.starfall.thread.demo07.demo072;

import java.io.PipedInputStream;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo07.demo072
 * @className ThreadWrite
 * @date 2019/6/27 22:55
 * @description ThreadRead
 */
public class ThreadRead extends Thread {
	private ReadData readData;
	private PipedInputStream inputStream;

	public ThreadRead(ReadData readData, PipedInputStream inputStream) {
		this.readData = readData;
		this.inputStream = inputStream;
	}

	@Override
	public void run() {
		readData.readMethod(inputStream);
	}
}
