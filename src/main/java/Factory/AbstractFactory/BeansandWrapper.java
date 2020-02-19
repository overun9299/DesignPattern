package main.java.Factory.AbstractFactory;

/**
 * Created by ZhangPY on 2020/2/19
 * Belong Organization OVERUN-9299
 * overun9299@163.com
 * Explain:红豆月饼皮
 */
public class BeansandWrapper implements IWrapper {
    @Override
    public void makeWrapper() {
        System.out.println("制作红豆月饼皮");
    }
}
