package com.starfall.designpattern.factorymethod;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.factorymethod
 * @className ConcreteProductA
 * @date 2019/7/9 17:16
 * @description ConcreteProductA 具体产品角色A
 */
public class ConcreteProductA implements Product {
    @Override
    public void produce() {
        System.out.println("ConcreteProductA 生产：" + this.getClass().getName());
    }
}