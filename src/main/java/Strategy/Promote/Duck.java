package main.java.Strategy.Promote;

/**
 * Created by ZhangPY on 2020/2/16
 * Belong Organization OVERUN-9299
 * overun9299@163.com
 * Explain:
 */
public abstract class Duck {

    /** 鸭子的飞行属性策略接口,下面也可以定义其他的策略接口属性 */
    FlyBehavior flyBehavior;

    /**
     * 各种类鸭子的信息抽象方法
     */
    abstract void info();

    /**
     * 鸭子的飞行方法
     */
    public void fly() {
        /** 使用飞行策略获取飞行信息 */
        if (flyBehavior != null) {
            flyBehavior.fly();
        }
    }
}
