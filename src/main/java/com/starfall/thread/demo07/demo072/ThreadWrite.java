package com.starfall.thread.demo07.demo072;

import java.io.PipedOutputStream;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo07.demo072
 * @className ThreadWrite
 * @date 2019/6/27 22:55
 * @description ThreadWrite
 */
public class ThreadWrite extends Thread {
	private WriteData writeData;
	private PipedOutputStream outputStream;

	public ThreadWrite(WriteData writeData, PipedOutputStream outputStream) {
		this.writeData = writeData;
		this.outputStream = outputStream;
	}

	@Override
	public void run() {
		writeData.writeMethod(outputStream);
	}
}
