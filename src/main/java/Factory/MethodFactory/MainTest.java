package main.java.Factory.MethodFactory;

import main.java.Factory.StaticFactory.Mooncakes;

/**
 * Created by ZhangPY on 2020/2/19
 * Belong Organization OVERUN-9299
 * overun9299@163.com
 * Explain:
 */
public class MainTest {

    public static void main(String[] args) {

        /** 创建五仁工厂 */
        MooncakesFactory mf1 = new FiveKernelFactory();
        mf1.makeMooncakes().eat();

        /** 创建豆沙工厂 */
        MooncakesFactory mf2 = new BeansandFactory();
        mf2.makeMooncakes().eat();
    }
}
