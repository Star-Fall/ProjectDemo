package com.starfall.designpattern.adapterpattern.ObjectAdapter;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.adapterpattern.ObjectAdapter
 * @className TestClient
 * @date 2019/9/4 15:14
 * @description 测试端
 */
public class TestClient {

    public static void main(String[] args) {
        Adaptee adaptee=new ConcreteAdaptee();
        Target target=new Adapter(adaptee);
        target.targetMethod();
    }
}
