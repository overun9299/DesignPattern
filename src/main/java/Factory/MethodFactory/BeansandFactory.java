package main.java.Factory.MethodFactory;

import main.java.Factory.StaticFactory.Beansand;
import main.java.Factory.StaticFactory.Mooncakes;

/**
 * Created by ZhangPY on 2020/2/19
 * Belong Organization OVERUN-9299
 * overun9299@163.com
 * Explain: 豆沙月饼工厂
 */
public class BeansandFactory extends MooncakesFactory {
    @Override
    Mooncakes makeMooncakes() {
        return new Beansand();
    }
}
