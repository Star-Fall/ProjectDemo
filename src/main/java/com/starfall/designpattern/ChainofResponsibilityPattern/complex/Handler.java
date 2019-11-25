package com.starfall.designpattern.ChainofResponsibilityPattern.complex;

/**
 * @author StarFall
 * @date 2019/11/24 20:15
 * @description 抽象处理者（Handler）
 */
public abstract class Handler {

    /**
     * 下一个处理者对象的引用
     */
    private Handler nextHandler;

    public abstract boolean handler(int request);

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}