package main.java.Factory.AbstractFactory;

/**
 * Created by ZhangPY on 2020/2/19
 * Belong Organization OVERUN-9299
 * overun9299@163.com
 * Explain: 五仁月饼皮
 */
public class FivekernelWrapper implements IWrapper {

    @Override
    public void makeWrapper() {
        System.out.println("制作五仁月饼皮！");
    }
}
