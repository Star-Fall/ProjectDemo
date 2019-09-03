package com.starfall.designpattern.singletonpattern.SerializationAttack;

import java.io.Serializable;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.singletonpattern.SerializationAttack
 * @className SingletonEnum
 * @date 2019/9/3 15:07
 * @description 枚举抵御序列化攻击
 */
public enum SingletonEnum implements Serializable {

    /**
     * 枚举对象，代表SingletonEnum的一个单例
     */
    INSTANCE;
}
