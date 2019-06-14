package com.starfall.thread.demo02;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.thread.demo02
 * @className Thread01_1
 * @date 2019/6/14 15:06
 * @description todo
 */
public class Thread01_2 extends Thread {

    private ThreadBean01 bean;

    public Thread01_2(ThreadBean01 bean) {
        this.bean = bean;
    }

    @Override
    public void run() {
        this.bean.addNum("b");
    }
}
