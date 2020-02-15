package main.java.Singleton;

/**
 * Created by ZhangPY on 2020/2/15
 * Belong Organization OVERUN-9299
 * overun9299@163.com
 * Explain:单例模式-双检锁
 */
public class Example5 {

    /** 静态但是不初始化，使用volatile关键字防止指令重排序 */
    private static volatile Example5 INSTANCE;

    /** 私有构造方法,保证不会通过构造器创建实例 */
    private Example5() {

    }

    /** 加锁保证线程安全 */
    public static Example5 getInstance() {
        /** 先判断线程是否为空 */
        if (INSTANCE == null) {
            synchronized (Example5.class) {
                if (INSTANCE == null) {
                    /** 为空就初始化 */
                    /** 因为判断和加锁不是原子性的,所以这块在检查一次 */
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    /** 新建并赋值 */
                    INSTANCE = new Example5();
                }
            }
        }
        /** 不为空返回 */
        return INSTANCE;
    }

    /** 测试是否线程不安全，得到实例的hashcode如果不相同则不是一个实例 */
    public static void main(String[] args) {

        for (int i = 0 ; i< 100 ; i++) {
            new Thread(() -> {
                System.out.println(Example5.getInstance().hashCode());
            }).start();
        }

    }
}
