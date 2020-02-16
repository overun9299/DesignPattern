package main.java.Strategy.Promote;

/**
 * Created by ZhangPY on 2020/2/16
 * Belong Organization OVERUN-9299
 * overun9299@163.com
 * Explain: 擅长飞行的鸭子的飞行行为
 */
public class DuckGoodFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我是很擅长飞行的鸭子");
    }
}
