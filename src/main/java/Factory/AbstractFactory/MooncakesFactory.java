package main.java.Factory.AbstractFactory;

/**
 * Created by ZhangPY on 2020/2/19
 * Belong Organization OVERUN-9299
 * overun9299@163.com
 * Explain: 月饼工厂
 */
public abstract class MooncakesFactory {
    /**
     * 生产月饼皮的产品接口
     *
     * @return IWrapper
     */
    abstract IWrapper makeWrapper();

    /**
     * 生产月饼馅的产品接口
     *
     * @return IFilling
     */
    abstract IFilling makeFilling();
}
