package com.starfall.designpattern.simplefactory;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.simplefactory
 * @className SimpleFactory
 * @date 2019/7/2 15:43
 * @description SimpleFactory 简单工厂
 */
public class SimpleFactory {
    /**
     * 根据产品类型获取具体产品角色
     *
     * @param product
     *            产品类型
     * @return 具体产品角色
     */
    public Product getProduct(String product) {
        if (Product.PRODUCT_A.equals(product)) {
            return new ConcreteProductA();
        } else if (Product.PRODUCT_B.equals(product)) {
            return new ConcreteProductB();
        }
        return null;
    }

    /**
     * 根据反射类型获取具体产品角色
     *
     * @param c
     *            class
     * @return 具体产品角色
     */
    public Product getProduct(Class c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return product;
    }
}
