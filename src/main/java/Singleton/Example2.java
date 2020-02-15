package main.java.Singleton;

import java.util.concurrent.TimeUnit;

/**
 * Created by ZhangPY on 2020/2/14
 * Belong Organization OVERUN-9299
 * overun9299@163.com
 * Explain: 单例模式-懒汉式
 * 为解决Example1中不使用就装载的问题，设计出懒汉模式也就是延迟加载，但是暴露出更严重的问题
 * 在多线程下，线程不安全
 */
public class Example2 {

    /** 静态但是不初始化 */
    private static Example2 INSTANCE;

    /** 私有构造方法,保证不会通过构造器创建实例 */
    private Example2() {

    }

    public static Example2 getInstance() {
        /** 先判断线程是否为空 */
        if (INSTANCE == null) {

            /** 为空就初始化 */
            /** 就是在这一步会出现多线程不安全，加入线程A判断‘INSTANCE’为空当他准备初始化时，
             * 线程B也判断‘INSTANCE’为空并且初始化，所以两个线程得到的不是一个实例 */
            /** 为了模拟效果这次出让线程sleep一段时间 */
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            /** 新建并赋值 */
            INSTANCE = new Example2();
        }
        /** 不为空返回 */
        return INSTANCE;
    }

    /** 测试是否线程不安全，得到实例的hashcode如果不相同则不是一个实例 */
    public static void main(String[] args) {

        for (int i = 0 ; i< 100 ; i++) {
            new Thread(() -> {
                System.out.println(Example2.getInstance().hashCode());
            }).start();
        }

    }
}
