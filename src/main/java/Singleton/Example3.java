package main.java.Singleton;

/**
 * Created by ZhangPY on 2020/2/14
 * Belong Organization OVERUN-9299
 * overun9299@163.com
 * Explain: 单例模式-线程安全的懒汉
 * 同时解决Example1和Example2的问题，但是带来性能下降的问题，就是在原有的getInstance方法上面加锁
 */
public class Example3 {

    /** 静态但是不初始化 */
    private static Example3 INSTANCE;

    /** 私有构造方法,保证不会通过构造器创建实例 */
    private Example3() {

    }

    /** 加锁保证线程安全 */
    public static synchronized Example3 getInstance() {
        /** 先判断线程是否为空 */
        if (INSTANCE == null) {

            /** 为空就初始化 */
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            /** 新建并赋值 */
            INSTANCE = new Example3();
        }
        /** 不为空返回 */
        return INSTANCE;
    }

    /** 测试是否线程不安全，得到实例的hashcode如果不相同则不是一个实例 */
    public static void main(String[] args) {

        for (int i = 0 ; i< 100 ; i++) {
            new Thread(() -> {
                System.out.println(Example3.getInstance().hashCode());
            }).start();
        }

    }
}
