package main.java.Strategy.Promote;

/**
 * Created by ZhangPY on 2020/2/16
 * Belong Organization OVERUN-9299
 * overun9299@163.com
 * Explain:不擅长飞行的鸭子的飞行行为
 */
public class DuckBadFly implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("我是不擅长飞行的鸭子");
    }
}
