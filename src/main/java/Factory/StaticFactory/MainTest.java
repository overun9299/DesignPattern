package main.java.Factory.StaticFactory;

/**
 * Created by ZhangPY on 2020/2/19
 * Belong Organization OVERUN-9299
 * overun9299@163.com
 * Explain:
 */
public class MainTest {


    public static void main(String[] args) {

        /** 得到五仁月饼 */
        MooncakesFactory.makeMooncakes("fk").eat();
        /** 得到红豆月饼 */
        MooncakesFactory.makeMooncakes("bs").eat();

    }
}
