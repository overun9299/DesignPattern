package main.java.Strategy.Original;

/**
 * Created by ZhangPY on 2020/2/16
 * Belong Organization OVERUN-9299
 * overun9299@163.com
 * Explain: 各种类鸭子的父类方法
 */
public abstract class Duck {

    /**
     * 各种类鸭子的信息抽象方法
     */
    abstract void info();

    /**
     * 鸭子的飞行方法
     */
    public void fly() {
        System.out.println("鸭子扑通扑通起飞了~~~~");
    }

    /**
     * 鸭子的游泳方法
     */
    public void swim() {
        System.out.println("鸭子跳进水里~~~~");
    }

    /**
     * 鸭子的鸣叫方法
     */
    public void tweet() {
        System.out.println("鸭子嘎嘎的鸣叫~~~~");
    }
}
