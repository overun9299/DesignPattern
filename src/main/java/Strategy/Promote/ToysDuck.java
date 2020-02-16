package main.java.Strategy.Promote;


/**
 * Created by ZhangPY on 2020/2/16
 * Belong Organization OVERUN-9299
 * overun9299@163.com
 * Explain: 玩具鸭继承自Duck父类 - 只会叫所以要重写其他两个方法，
 * 到这里问题就暴露出来的，有些子类需要重写父类的方法太多了
 */
public class ToysDuck extends Duck {

    /** 创建构造器，将属于自己的FlyBehavior进行赋值 */
    public ToysDuck() {
        flyBehavior = new DuckBadFly();
    }

    @Override
    void info() {
        System.out.println("我是一只玩具鸭子，只会叫");
        /** 调用对应属性 */
        fly();
    }

}
