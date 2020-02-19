package main.java.Factory.AbstractFactory;

/**
 * Created by ZhangPY on 2020/2/19
 * Belong Organization OVERUN-9299
 * overun9299@163.com
 * Explain:
 */
public class FivekernelFactory extends MooncakesFactory {

    @Override
    IWrapper makeWrapper() {
        return new FivekernelWrapper();
    }

    @Override
    IFilling makeFilling() {
        return new FivekernelFiling();
    }

}
