package main.java.Singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by ZhangPY on 2020/2/15
 * Belong Organization OVERUN-9299
 * overun9299@163.com
 * Explain:单例模式-静态内部类
 * JVM保证单例
 * 加载外部类时不会加载内部类，这样可以实现懒加载
 */
public class Example6 {

    /** 私有构造方法 */
    private Example6() {

    }

    /** 定义静态内部类 */
    private static class ExampleHolder {
        private static final Example6 INSTANCE = new Example6();
    }

    /** 对外提供的方法*/
    public static Example6 getInstance() {
        return ExampleHolder.INSTANCE;
    }

    public static void main(String[] args) {
        /** 使用线程池测试 */
        ExecutorService executorService = Executors.newFixedThreadPool(100);
        for (int i = 0 ; i<100 ; i++) {
            executorService.execute(() -> {
                System.out.println(Example6.getInstance().hashCode());
            });
        }
    }
}
