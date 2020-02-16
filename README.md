----
# 总结集中设计模式
## java的设计模式总结、理解、实现

* ## Singleton 单例模式
    * 懒汉、饿汉、双检锁、枚举等
* ## Strategy 策略模式
    * ### Original：此包里面的实现方式是经典原始的父类、子类继承
      * Duck：父类，包括swim、fly、tweet三个方法，
      * WildDuck：野鸭继承自Duck，野鸭可以飞、可以叫、可以游泳所以不用重写父类的方法，完美继承
      * CulturedDuck：家养鸭子继承自Duck，家养的鸭子可以叫、可以游泳但是不会飞，所以要重写父类fly方法
      * ToysDuck：玩具鸭子继承自Duck，玩具鸭子只会叫所以要重写除tweet的方法（麻烦）
      
      **上面三个子类问题就暴露出来了，有的子类需要重写父类的大部分方法，比较繁琐**
    * ### Promote:使用聚合模式实现Duck问题
      * Duck：父类，有FlyBehavior飞行行为，fly方法但是方法的实现是靠FlyBehavior飞行行为
      * FlyBehavior：飞行行为接口
      * DuckGoodFly：实现FlyBehavior飞行接口，好的飞行行为
      * DuckBadFly：实现FlyBehavior飞行接口，不擅长飞行的飞行行为
      * 后面各种鸭子在自己的构造方法中赋值对应的飞行行为
      
      **这样相当于把原来的方法，抽成接口并实现不同的行为，但是也有缺点，文件太多**
* ## Bridge 桥接模式
     * 桥接模式和策略模式类似
