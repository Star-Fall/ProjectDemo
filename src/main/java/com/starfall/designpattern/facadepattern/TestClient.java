package com.starfall.designpattern.facadepattern;

/**
 * @author StarFall
 * @date 2019/11/13 23:52
 * @description 外观模式（Facade Pattern）测试端
 */
public class TestClient {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.method();
    }
}
