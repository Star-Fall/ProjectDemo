package com.starfall.designpattern.CommandPattern;

/**
 * @author StarFall
 * @date 2019/11/26 23:13
 * @description 请求者角色（Invoker）
 */
public class Invoker {

    /**
     * 持有命令对象的引用
     */
    private Command command;

    public Invoker(Command command){
        this.command=command;
    }

    /**
     * 行动方法
     */
    public void action(){
        System.out.println("请求者的行动方法中，调用命令对象的执行方法execute");
        this.command.execute();
    }
}