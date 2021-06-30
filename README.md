# 简介
该仓库是为学习23种设计模式建设的，记录学习过程中的代码和笔记，记录老鸟和小菜的故事....
🐤 0_0 哈哈

# 设计模式

## 设计模式类型
设计模式分为3中类型，共23种：
1. 创建型模式：[单例模式](https://github.com/RookieDe/mode#一单例设计模式)，[抽象工厂模式](https://github.com/RookieDe/mode#抽象工厂模式)， 原型模式，建造者模式，[工厂模式](https://github.com/RookieDe/mode#二工厂模式)；
2. 结构型模式；适配器模式，桥接模式，装饰模式，组合模式，外观模式，享元模式，代理模式；
3. 行为型模式：模板方法模式，命令模式，访问者模式，迭代器模式，观察者模式，中介者模式，备忘录模式，解释器模式（Interpreter模式），状态模式，策略模式，职责链模式（责任链模式）

## 设计模式核心思想
1. 找出应用中可能需要变化之处，把它们独立出来，不要和那些不需要变换的代码混在一起。
2. 针对接口编程，而不是针对实现编成。
3. 为了交互对象之间的松耦合设计而努力。

## 设计模式七大原则：
1. [单一职责原则](https://github.com/RookieDe/mode#1单一职责原则)
2. [接口隔离原则](https://github.com/RookieDe/mode#2接口隔离原则)
3. [依赖倒置（倒转）原则](https://github.com/RookieDe/mode#3依赖倒转原则)
4. [里氏替换原则](https://github.com/RookieDe/mode#4里氏替换原则)
5. [开闭原则](https://github.com/RookieDe/mode#5开闭原则)
6. [迪米特法则](https://github.com/RookieDe/mode#6迪米特法则)
7. [合成复用原则](https://github.com/RookieDe/mode#7合成复用原则)

### 1.单一职责原则
对类来说，即一个类应该只负责一项职责。如A负责不同的职责：职责1，职责2。当职责1需求变更而改变A时，可能造成职责2执行错误，所以需要将A的粒度分解为A1，A2。单一职责注意事项和细节
1. 降低类的复杂度，一个类只负责一项职责。
2. 提高类的可读性，可维护性。
3. 降低变更引起的风险
4. 通常情况下，我们应当遵循单一职责，只要逻辑够简单，才可以在代码级违反单一职责，只有类中的方法数量足够少，可以在发放级别保持单一职责原则。

### 2.接口隔离原则
客户端不应该依赖它不需要的接口，即一个类对另一个类的依赖应该建立在最小的接口上。

### 3.依赖倒转原则
1. 高层模块不应该依赖低层模块，二者都应该依赖其抽象；
2. 抽象不应该依赖细节，细节应该依赖抽象；
3. 依赖倒转（倒置）的中心思想是面向接口编程；
4. 依赖倒转原则是基于这样的设计理念：相较于细节的多变性，抽象的东西要稳定得多。以抽象稳基础的架构比细节为基础的架构稳定得多。在java中，抽象指的是接口或抽象类，细节就是具体的实现类。
5. 使用接口或抽象类的目的是制定好的规范，而不涉及任何具体的操作，把展现细节的任务交给他们的实现类去完成。


### 4.里氏替换原则
1. 继承包含这样一层含义；父类中凡是已经实现好的方法， 实际上是设定一种规范和契约，虽然不强制所有的子类必须遵守这些契约，但是如果子类对这些已经实现的方法任意修改，就会对整个体系早成破坏。
2. 继承在给程序设计带来便利的同时，也带来了弊端。比如使用继承会给程序带来侵入性，程序的可移植性降低，增加对象间的耦合性，如果一个类被其它类所继承，则当这个类需要修改时，必须考虑所有的子类，并且父类修改后，所有涉及到的子类都有可能产生故障。
3. 问题提出：在编程中，如何正确的使用继承？>=里氏替换原则

在使用继承时，遵循里氏替换原则，在子类中尽量不要重写父类的方法。 里氏替换原则告诉我们，继承实际上是让两个类的耦合性增强了，在适当的情况下，可以通过聚合，组合，依赖来解决关系。

### 5.开闭原则
1. 开闭原则是编程中最基础，最重要的设计原则；
2. 一个软件实体如类，模块和函数应该对扩展开放（对提供方），对修改关闭（对使用方）。用抽象构建框架，用实现展现扩展细节。
3. 当软件需要变化时，尽量通过扩展软件实体的行为来实现变化，而不是通过修改已有的代码来实现变化。
4. 编程中遵循其他原则，以及使用设计模式的目的就是遵循开闭原则。

### 6.迪米特法则
1. 一个对象应该对其它对象保持最小的了解；
2. 类与类的关系越密切，耦合度越大；
3. 迪米特法则（Demeter Principle）又叫最小知道原则，即一个类对自己依赖的类知道越少越好，也就是说，对于被依赖的类不管多么复杂，都尽量将逻辑封装在类的内部。对外除了提供的public方法，不对外泄露任何信息。
4. 迪米特法则还有个更简单的定义：只与直接的朋友通信。

迪米特法则的核心是降低类之间的耦合
但是注意：由于每个类都减少了不必要的依赖，因此迪米特法则只是要求降低类间（对象间）耦合关系，并不是要求完全没有依赖关系。

### 7.合成复用原则
原则是尽量使用合成/聚合的方式，而不是使用继承


## 一：单例设计模式
所谓类的单例设计模式，就是采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例，并且该类只提供一个取得其对象实例的方法(静态方法)。单例设计模式八种方式单例模式有八种方式：
* [饿汉式(静态常量)](https://github.com/RookieDe/mode#1饿汉式静态常量)
* [饿汉式（静态代码块）](https://github.com/RookieDe/mode#2饿汉式静态代码块)
* [懒汉式(线程不安全)](https://github.com/RookieDe/mode#3懒汉式线程不安全)
* [懒汉式(线程安全，同步方法)](https://github.com/RookieDe/mode#4懒汉式线程安全同步方法)
* [懒汉式(线程安全，同步代码块)](https://github.com/RookieDe/mode#5懒汉式线程安全同步代码块)
* [双重检查](https://github.com/RookieDe/mode#5懒汉式线程安全同步代码块)
* [静态内部类](https://github.com/RookieDe/mode#6静态内部类)
* [枚举](https://github.com/RookieDe/mode#7枚举)

### 1.饿汉式（静态常量）
#### 应用实例
步骤如下：
1. 构造器私有化 (防止 new )
2. 类的内部创建对象
3. 向外暴露一个静态的公共方法。getInstance
4. 代码实现:
```java
/**
* 饿汉式（静态变量）
*/
class Singleton{
    /**
     * 1.定义一个私有构造，防止外部new
     */
    private Singleton(){
    }

    /**
     * 2.定义一个内部的对象实例
     */
    private final static Singleton instance = new Singleton();

    /**
     * 3.提供一个供外部调用的公有静态方法，返回实例对象
     * @return
     */
    public static Singleton getInstance() {
        return instance;
    }
}
```

#### 优缺点说明：
1. 优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题；
2. 缺点：在类装载的时候就完成实例化，没有达到 Lazy Loading 的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费；
3. 这种方式基于 classloder 机制避免了多线程的同步问题，不过，instance 在类装载时就实例化，在单例模式中大多数都是调用 getInstance 方法，但是导致类装载的原因有很多种，因此不能确定有其他的方式（或者其他的静态方法）导致类装载，这时候初始化 instance 就没有达到 lazy loading 的效果
4. 结论：这种单例模式可用，可能造成内存浪费

### 2.饿汉式（静态代码块）
#### 应用实例
```java
/**
* 饿汉式（静态代码块）
*/
class Singleton2{

    /**
     * 1.定义一个私有构造，防止外部new
     */
    private Singleton2() {

    }

    /**
     * 2.定义一个内部的对象实例
     */
    private static Singleton2 singleton2;

    /**
     * 在静态代码块中创建实例
     */
    static {
        singleton2 = new Singleton2();
    }

    /**
     * 3.提供一个供外部调用的公有静态方法，返回实例对象
     * @return
     */
    public static Singleton2 getInstance(){
        return singleton2;
    }
}
```
#### 优缺点说明：
1. 这种方式和上面的方式其实类似，只不过将类实例化的过程放在了静态代码块中，也是在类装载的时候，就执行静态代码块中的代码，初始化类的实例。优缺点和上面是一样的。
2. 结论：这种单例模式可用，但是可能造成内存浪费

### 3.懒汉式（线程不安全）
#### 应用实例
```java
class Singleton3{
    private static Singleton3 singleton3;

    private Singleton3(){

    }

    /**
     * 提供一个静态公有方法，当使用到该方法时，才去创建instance
     * 即懒汉式
     * @return
     */
    public static Singleton3 getInstance(){
        if (singleton3 == null){
            return new Singleton3();
        }
        return singleton3;
    }
}
```
#### 优缺点说明：
1. 起到了 Lazy Loading 的效果，但是只能在单线程下使用。
2. 如果在多线程下，一个线程进入了 if (singleton == null)判断语句块，还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例产生多个实例。所以在多线程环境下不可使用这种方式
3. 结论：在实际开发中，不要使用不要使用这种方式

### 4.懒汉式（线程安全，同步方法）
#### 应用实例
```java
/**
* 懒汉式（线程安全，同步方法）
*/
class Singleton4{
    private static Singleton4 singleton4;

    private Singleton4(){

    }

    /**
     * 提供一个静态公有方法，当时用到该方法时，才去创建instance
     * 即懒汉式
     * 加入synchronized，同一时间只能又一个线程进入
     * @return
     */
    public static synchronized Singleton4 getInstance(){
        if (singleton4 == null){
            return new Singleton4();
        }
        return singleton4;
    }
}
```
#### 优缺点说明：
1. 解决了线程安全问题
2. 效率太低了，每个线程在想获得类的实例时候，执行 getInstance()方法都要进行同步。而其实这个方法只执行一次实例化代码就够了，后面的想获得该类实例，直接 return 就行了。方法进行同步效率太方法进行同步效率太低
3. 结论：在实际开发中，不推荐不推荐使用这种方式

### 5.懒汉式（线程安全，同步代码块）
#### 应用实例 
```java
/**
* 懒汉式（线程安全，同步代码块）
*/
class Singleton5{
    private static volatile Singleton5 singleton5;

    private Singleton5(){

    }
    
    /**
     * 提供一个静态公有方法，当时用到该方法时，才去创建instance
     * 即懒汉式 双重检查
     * 加入synchronized代码块和volatile，保证线程安全
     * @return
     */
    public static synchronized Singleton5 getInstance(){
        if (singleton5 == null){
            synchronized (Singleton5.class){
                if (singleton5 == null){
                    return new Singleton5();
                }
            }
        }
        return singleton5;
    }
}
```
#### 优缺点说明：
1. Double-Check 概念是多线程开发中常使用到的，如代码中所示，我们进行了两次 if (singleton == null)检查，这样就可以保证线程安全了。
2. 这样，实例化代码只用执行一次，后面再次访问时，判断 if (singleton == null)，直接 return 实例化对象，也避免的反复进行方法同步.
3. 线程安全；延迟加载；效率较高
4. 结论：在实际开发中，推荐使用这种单例设计模式

### 6.静态内部类
#### 应用实例
```java
/**
* 静态内部类
*/
class Singleton6{

    private Singleton6(){

    }

    /**
     * 静态内部类，只有在调用本类的时候，才会创建；
     * （类加载是线程安全的）
     */
    private static class SingletonInstance{
        private static final Singleton6 INSTANCE = new Singleton6();
    }

    public static Singleton6 getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
```
#### 优缺点说明：
1. 这种方式采用了类装载的机制来保证初始化实例时只有一个线程。
2. 静态内部类方式在 Singleton6 类被装载时并不会立即实例化，而是在需要实例化时，调用 getInstance 方法，才会装载 SingletonInstance 类，从而完成 Singleton 的实例化。
3. 类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM 帮助我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。
4. 优点：避免了线程不安全，利用静态内部类特点实现延迟加载，效率高
5. 结论：推荐推荐使用

### 7.枚举
#### 应用实例
```java
/**
* 枚举，实现单例
*/
enum Singleton{
    INSTANCE;
    public void getInstance(){

    }
}
```

#### 优缺点说明：
1. 这借助 JDK1.5 中添加的枚举来实现单例模式。不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象。
2. 这种方式是 Effective Java 作者作者 Josh Bloch 提倡提倡的方式
3. 结论：推荐推荐使用


### 单例模式注意事项和细节说明
1. 单例模式保证了 系统内存中该类只存在一个对象，节省了系统资源，对于一些需要频繁创建销毁的对象，使用单例模式可以提高系统性能
2. 当想实例化一个单例类的时候，必须要记住使用相应的获取对象的方法，而不是使用 new
3. 单例模式使用的场景使用的场景：需要频繁的进行创建和销毁的对象、创建对象时耗时过多或耗费资源过多(即：重量级对象)，但又经常用到的对象、工具类对象工具类对象、频繁访问数据库或文件的对象(比如数据源、数据源、session 工厂等)



## 二：工厂模式

### 简单工厂模式

#### 看一个披萨的项目：
要便于披萨种类的扩展，要便于维护
1. 披萨的种类很多(比如 GreekPizz、CheesePizz 等)
2. 披萨的制作有 prepare，bake, cut, box
3. 完成披萨店订购功能。
   
使用传统的方式来完成:
```java
public class OrderPizza {

    public  OrderPizza(){
        Pizza pizza = null;
        String orderType;

        orderType = getType();
        if ("fruit".equals(orderType)) {
            pizza = new FruitPizza();
            pizza.setName("fruit");
        } else if ("cheese".equals(orderType)) {
            pizza = new CheesePizza();
            pizza.setName("cheese");
        } else {
            System.err.println("没有这个披萨！！ ");
            return;
        }
        //披萨制作
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

    }
    
    /**
     * 获取订购的披萨
     * @return
     */
    private String getType() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.err.println("请输入要购买的披萨：");
        try {
            String s = bufferedReader.readLine();
            return s;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
```

##### 传统的方式的优缺点:
1. 优点是比较好理解，简单易操作。
2. 缺点是违反了设计模式的 ocp 原则原则，即对扩展开放，对修改关闭。即当我们给类增加新功能的时候，尽量不修改代码，或者尽可能少修改代码.
3. 比如我们这时要新增加一个 Pizza 的种类的种类(Pepper 披萨披萨)，我们就需要更改原来的代码；

##### 改进的思路分析
分析：修改代码可以接受，但是如果我们在其它的地方也有创建 Pizza 的代码，就意味着，也需要修改，而创建 Pizza的代码，往往有多处。

思路：把创建把创建 Pizza 对象封装到一个类中，这样我们有新的这样我们有新的 Pizza 种类时种类时，只需要修改该类就可只需要修改该类就可，其它有创建到 Pizza对象的代码就不需要修改了.-> 简单工厂简单工厂模式。

#### 基本介绍

1. 简单工厂模式是属于创建型模式创建型模式，是工厂模式的一种。简单工厂模式是由一个工厂对象决定创建出哪一种产品类的实例。简单工厂模式是工厂模式家族中最简单实用的模式
2. 简单工厂模式：定义了一个创建对象的类，由这个类来封装实例化对象的行为封装实例化对象的行为(代码)
3. 在软件开发中，当我们会用到大量的创建某种、某类或者某批对象时，就会使用到工厂模式.

#### 1.使用简单工厂模式
简单工厂模式的设计方案: 定义一个可以实例化 Pizaa 对象的类，封装创建对象的代码。
```java
public class SimpleFactory {

    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("fruit".equals(orderType)) {
            pizza = new FruitPizza();
            pizza.setName("greek");
        } else if ("cheese".equals(orderType)) {
            pizza = new CheesePizza();
            pizza.setName("cheese");
        }
        return pizza;
    }

    /**
     * 简单工厂模式 也叫 静态工厂模式
     * @param orderType
     * @return
     */
    public static Pizza createPizza2(String orderType) {
        Pizza pizza = null;
        if ("fruit".equals(orderType)) {
            pizza = new FruitPizza();
            pizza.setName("fruit");
        } else if ("cheese".equals(orderType)) {
            pizza = new CheesePizza();
            pizza.setName("cheese");
        }
        return pizza;
    }
}


public class OrderPizza2 {
    Pizza pizza = null;
    String orderType = "";
    public OrderPizza2() {

        do {
            orderType = getType();
            pizza = SimpleFactory.createPizza2(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("没有找到披萨种类！！");
                break;
            }
        } while (true);
    }
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 披萨类型:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
```

### 工厂方法模式

简单工厂模式的设计方案: 定义一个可以实例化 Pizaa 对象的类，封装创建对象的代码。

看一个新的需求
披萨项目新的需求：客户在点披萨时，可以点不同口味的披萨不同口味的披萨，比如 北京的奶酪 pizza、北京的水果 pizza 或者是伦敦的奶酪 pizza、伦敦的水果 pizza。

思路 1
使用简单工厂模式，创建不同的简单工厂类不同的简单工厂类，比如 BJPizzaSimpleFactory、LDPizzaSimpleFactory 等等.从当前
这个案例来说，也是可以的，但是考虑到项目的规模，以及软件的可维护性、可扩展性并不是特别好

思路 2
使用工厂方法模式

#### 工厂方法模式介绍
1. 工厂方法模式设计方案：将披萨项目的实例化功能抽象成抽象方法，在不同的口味点餐子类中具体实现。
2. 工厂方法模式：定义了一个创建对象的抽象方法，由子类决定要实例化的类类决定要实例化的类。工厂方法模式将对象的实例对象的实例化推迟到子类。

### 抽象工厂模式
1. 抽象工厂模式：定义了一个 interface 用于创建相关或有依赖关系的对象簇，而无需指明具体的类
2. 抽象工厂模式可以将简单工厂模式和工厂方法模式进行整合。
3. 从设计层面看，抽象工厂模式就是对简单工厂模式的改进(或者称为进一步的抽象)
4. 将工厂抽象成两层两层，AbsFactory(抽象工厂抽象工厂) 和 具体实现的工厂子类具体实现的工厂子类。程序员可以根据创建对象类型使用对应的工厂子类。这样将单个的简单工厂类变成了工厂簇，更利于代码的维护和扩展。

#### 工厂模式小结

工厂模式的意义
1. 将实例化对象的代码提取出来，放到一个类中统一管理和维护，达到和主项目的依赖关系的解耦。从而提高项目的扩展和维护性
2. 三种工厂模式 (简单工厂模式、工厂方法模式、抽象工厂模式)
3. 设计模式的依赖抽象原则
    1. 创建对象实例时，不要直接 new 类, 而是把这个 new 类的动作放在一个工厂的方法中，并返回。有的书上说，变量不要直接持有具体类的引用。
    2. 不要让类继承具体类，而是继承抽象类或者是实现 interface(接口)
    3. 不要覆盖基类中已经实现的方法。

入口类：
```java
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new LDFactory());
    }
}
```

订单类:
```java
public class OrderPizza {

    AbsFactory factory;

    public OrderPizza(AbsFactory factory) {
        setFactory(factory);
    }

    private void setFactory(AbsFactory factory) {
        Pizza pizza = null;
        String orderType = "";
        this.factory = factory;
        do {
            orderType = getType();
            pizza = factory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("没有该披萨种类！");
                break;
            }
        } while (true);
    }

    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
```

抽象披萨类：
```java
public abstract class Pizza {
    /**
     * 披萨名称
     */
    protected String name;

    /**
     * 准备阶段制作方法
     */
    public abstract void prepare();

    /**
     * 烧烤制作披萨
     */
    public void bake() {
        System.out.println(name + " baking;");
    }

    /**
     *  切披萨
     */
    public void cut() {
        System.out.println(name + " cutting;");
    }

    /**
     * 盒子打包
     */
    public void box() {
        System.out.println(name + " boxing;");
    }

    public void setName(String name) {
        this.name = name;
    }
}
```

工厂接口：
```java
public interface AbsFactory {
    Pizza createPizza(String orderType);
}
```

抽象工厂方法：

```java
//北京披萨
public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new BJCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}

//伦敦披萨
public class LDFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new LDCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
```

工厂实现方法：
```java
//北京奶酪披萨
public class BJCheesePizza  extends Pizza{
    @Override
    public void prepare() {
        setName("北京奶酪披萨");
        System.err.println("北京的奶酪披萨，准备原材料");
    }
}

//北京胡椒披萨
public class BJPepperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("北京胡椒披萨");
        System.err.println("北京的胡椒披萨，准备原材料");
    }
}

//伦敦奶酪披萨
public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦奶酪披萨");
        System.err.println("伦敦的奶酪披萨，准备原材料");
    }
}

//伦敦胡椒披萨
public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦胡椒披萨");
        System.err.println("伦敦的胡椒披萨，准备原材料");
    }
}
```