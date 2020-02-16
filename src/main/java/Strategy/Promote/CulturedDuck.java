package main.java.Strategy.Promote;



/**
 * Created by ZhangPY on 2020/2/16
 * Belong Organization OVERUN-9299
 * overun9299@163.com
 * Explain: 养殖鸭继承自Duck父类 - 会叫、会游泳但是不会飞，所以得重写父类的Fly方法
 */
public class CulturedDuck extends Duck{

    /** 创建构造器，将属于自己的FlyBehavior进行赋值 */
    public CulturedDuck() {
        flyBehavior = new DuckBadFly();
    }

    @Override
    void info() {
        System.out.println("我是一只养殖鸭，会叫、会游泳");
        /** 调用对应属性 */
        fly();

    }
}
