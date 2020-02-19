package main.java.Factory.AbstractFactory;

/**
 * Created by ZhangPY on 2020/2/19
 * Belong Organization OVERUN-9299
 * overun9299@163.com
 * Explain:
 */
public class FivekernelFiling implements IFilling {
    @Override
    public void makeFilling() {
        System.out.println("五仁馅制作");
    }
}
