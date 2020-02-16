package main.java.Strategy.Original;

/**
 * Created by ZhangPY on 2020/2/16
 * Belong Organization OVERUN-9299
 * overun9299@163.com
 * Explain:
 */
public class TextMethod {

    public static void main(String[] args) {
        Duck culturedDuck = new CulturedDuck();
        Duck toysDuck = new ToysDuck();
        Duck wildDuck = new WildDuck();
        culturedDuck.info();
        System.out.println("--------------------------------");
        toysDuck.info();
        System.out.println("--------------------------------");
        wildDuck.info();
    }
}
