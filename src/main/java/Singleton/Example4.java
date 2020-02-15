package main.java.Singleton;

/**
 * Created by ZhangPY on 2020/2/15
 * Belong Organization OVERUN-9299
 * overun9299@163.com
 * Explain: 单例模式-线程安全的懒汉
 * 对Example4进行优化，将锁细化，妄图通过减少同步代码块来提高性能，然后不可行
 */
public class Example4 {

    /** 静态但是不初始化 */
    private static Example4 INSTANCE;

    /** 私有构造方法,保证不会通过构造器创建实例 */
    private Example4() {

    }

    /** 加锁保证线程安全 */
    public static Example4 getInstance() {
        /** 先判断线程是否为空 */
        if (INSTANCE == null) {
            /** 因为判断和加锁不是原子性的 */
            synchronized (Example4.class) {
                /** 为空就初始化 */
                try {
                    Thread.sleep(1);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                /** 新建并赋值 */
                INSTANCE = new Example4();
            }
        }
        /** 不为空返回 */
        return INSTANCE;
    }

    /** 测试是否线程不安全，得到实例的hashcode如果不相同则不是一个实例 */
    public static void main(String[] args) {

        for (int i = 0 ; i< 100 ; i++) {
            new Thread(() -> {
                System.out.println(Example4.getInstance().hashCode());
            }).start();
        }

    }
}
