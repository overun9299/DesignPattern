package main.java.Factory.StaticFactory;

/**
 * Created by ZhangPY on 2020/2/19
 * Belong Organization OVERUN-9299
 * overun9299@163.com
 * Explain:
 */
public class MooncakesFactory {

    /**
     * 制造一个月饼
     * @param mcType
     */
    public static Mooncakes makeMooncakes(String mcType) {
        if ("fk".equals(mcType)) {
            return new FiveKernel();
        } else if ("bs".equals(mcType)){
            return new Beansand();
        }
        return null;
    }
}
