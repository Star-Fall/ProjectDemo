package com.starfall.designpattern.CommandPattern;

/**
 * @author StarFall
 * @date 2019/11/26 23:07
 * @description 接收者角色（Receiver）
 */
public class Receiver {

    /**
     * 行动方法
     */
    public void action() {
        System.out.println("接收者负责执行命令的具体操作，真正实现业务逻辑");
    }
}