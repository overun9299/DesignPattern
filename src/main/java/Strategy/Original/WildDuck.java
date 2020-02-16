package main.java.Strategy.Original;

/**
 * Created by ZhangPY on 2020/2/16
 * Belong Organization OVERUN-9299
 * overun9299@163.com
 * Explain: 野鸭继承自Duck父类 - 会飞、会叫、会游泳，所以可以完美使用父类的方法
 */
public class WildDuck extends Duck{

    @Override
    void info() {
        System.out.println("我是一直野鸭，会飞、会叫、会游泳。");
        /** 调用对应属性 */
        fly();
        swim();
        tweet();
    }


}
