package main.java.Singleton;

/**
 * Created by ZhangPY on 2020/2/14
 * Belong Organization OVERUN-9299
 * overun9299@163.com
 * Explain: 单例模式-饿汉式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 简单实用、推荐使用
 * 小缺点：你不用它，你装载它干什么。
 */
public class Example1 {

    /** 静态实例 */
    private static final Example1 INSTANCE = new Example1();

    /** 私有构造方法,保证不会通过构造器创建实例 */
    private Example1() {

    }

    /** 对外提供静态方法，返回实例 */
    public static Example1 getInstance() {
        return INSTANCE;
    }

}
