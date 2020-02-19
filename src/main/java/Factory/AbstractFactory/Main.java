package main.java.Factory.AbstractFactory;

public class Main {
    public static void main(String[] args) {

        /** 五仁月饼 */
        MooncakesFactory fivekernelFactory = new FivekernelFactory();
        fivekernelFactory.makeWrapper().makeWrapper();
        fivekernelFactory.makeFilling().makeFilling();

        /** 豆沙月饼 */
        MooncakesFactory beansandFactory = new BeansandFactory();
        beansandFactory.makeWrapper().makeWrapper();
        beansandFactory.makeFilling().makeFilling();
    }
}
