package main.java.Singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by ZhangPY on 2020/2/15
 * Belong Organization OVERUN-9299
 * overun9299@163.com
 * Explain:单例模式-枚举类
 * java创始人发明，最完美的单例模式，不常用
 * 不仅可以解决线程安全问题，还可以防止反序列化
 */
public enum Example7 {

    INSTANCE;

    public static void main(String[] args) {
        /** 使用线程池测试 */
        ExecutorService executorService = Executors.newFixedThreadPool(100);
        for (int i = 0 ; i<100 ; i++) {
            executorService.execute(() -> {
                System.out.println(Example7.INSTANCE.hashCode());
            });
        }
    }

}
