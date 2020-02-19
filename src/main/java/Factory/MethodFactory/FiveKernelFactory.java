package main.java.Factory.MethodFactory;

import main.java.Factory.StaticFactory.FiveKernel;
import main.java.Factory.StaticFactory.Mooncakes;

/**
 * Created by ZhangPY on 2020/2/19
 * Belong Organization OVERUN-9299
 * overun9299@163.com
 * Explain: 五仁工厂
 */
public class FiveKernelFactory extends MooncakesFactory {
    @Override
    Mooncakes makeMooncakes() {
        return new FiveKernel();
    }
}
