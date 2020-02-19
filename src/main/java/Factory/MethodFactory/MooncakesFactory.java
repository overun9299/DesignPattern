package main.java.Factory.MethodFactory;

import main.java.Factory.StaticFactory.Mooncakes;

/**
 * Created by ZhangPY on 2020/2/19
 * Belong Organization OVERUN-9299
 * overun9299@163.com
 * Explain: 月饼工厂抽象方法
 */
public abstract class MooncakesFactory {

    /**
     * 制作一个月饼
     * @return
     */
    abstract Mooncakes makeMooncakes();
}
