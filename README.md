# 简介
该仓库是为学习23种设计模式建设的，记录学习过程中的代码和笔记，记录老鸟和小菜的故事....
🐤 0_0 哈哈

# 23种设计模式
## 设计模式七大原则有：
1. 单一职责原则
2. 接口隔离原则
3. 依赖倒置（倒转）原则
4. 里氏替换原则
5. 开闭原则
6. 迪米特法则
7. 合成复用原则

### 1.单一职责原则
对类来说，即一个类应该只负责一项职责。如A负责不同的职责：职责1，职责2。当职责1需求变更而改变A时，可能造成职责2执行错误，所以需要将A的粒度分解为A1，A2。单一职责注意事项和细节
1. 降低类的复杂度，一个类只负责一项职责。
2. 提高类的可读性，可维护性。
3. 降低变更引起的风险
4. 通常情况下，我们应当遵循单一职责，只要逻辑够简单，才可以在代码级违反单一职责，只有类中的方法数量足够少，可以在发放级别保持单一职责原则。

### 2.接口隔离原则
客户端不应该依赖它不需要的接口，即一个类对另一个类的依赖应该建立在最小的接口上。3.依赖倒转原则
1. 高层模块不应该依赖低层模块，二者都应该依赖其抽象；
2. 抽象不应该依赖细节，细节应该依赖抽象；
3. 依赖倒转（倒置）的中心思想是面向接口编程；
4. 依赖倒转原则是基于这样的设计理念：相较于细节的多变性，抽象的东西要稳定得多。以抽象稳基础的架构比细节为基础的架构稳定得多。在java中，抽象指的是接口或抽象类，细节就是具体的实现类。
5. 使用接口或抽象类的目的是制定好的规范，而不涉及任何具体的操作，把展现细节的任务交给他们的实现类去完成。

### 3.依赖倒转原则
1. 高层模块不应该依赖低层模块，二者都应该依赖其抽象；
2. 抽象不应该依赖细节，细节应该依赖抽象；
3. 依赖倒转（倒置）的中心思想是面向接口编程；
4. 依赖倒转原则是基于这样的设计理念：相较于细节的多变性，抽象的东西要稳定得多。以抽象稳基础的架构比细节为基础的架构稳定得多。在java中，抽象指的是接口或抽象类，细节就是具体的实现类。
5. 使用接口或抽象类的目的是制定好的规范，而不涉及任何具体的操作，把展现细节的任务交给他们的实现类去完成。


###4.里氏替换原则
1. 继承包含这样一层含义；父类中凡是已经实现好的方法， 实际上是设定一种规范和契约，虽然不强制所有的子类必须遵守这些契约，但是如果子类对这些已经实现的方法任意修改，就会对整个体系早成破坏。
2. 继承在给程序设计带来便利的同时，也带来了弊端。比如使用继承会给程序带来侵入性，程序的可移植性降低，增加对象间的耦合性，如果一个类被其它类所继承，则当这个类需要修改时，必须考虑所有的子类，并且父类修改后，所有涉及到的子类都有可能产生故障。
3. 问题提出：在编程中，如何正确的使用继承？>=里氏替换原则

在使用继承时，遵循里氏替换原则，在子类中尽量不要重写父类的方法。 里氏替换原则告诉我们，继承实际上是让两个类的耦合性增强了，在适当的情况下，可以通过聚合，组合，依赖来解决关系。

###5.开闭原则
1. 开闭原则是编程中最基础，最重要的设计原则；
2. 一个软件实体如类，模块和函数应该对扩展开放（对提供方），对修改关闭（对使用方）。用抽象构建框架，用实现展现扩展细节。
3. 当软件需要变化时，尽量通过扩展软件实体的行为来实现变化，而不是通过修改已有的代码来实现变化。
4. 编程中遵循其他原则，以及使用设计模式的目的就是遵循开闭原则。

###6.迪米特法则
1. 一个对象应该对其它对象保持最小的了解；
2. 类与类的关系越密切，耦合度越大；
3. 迪米特法则（Demeter Principle）又叫最小知道原则，即一个类对自己依赖的类知道越少越好，也就是说，对于被依赖的类不管多么复杂，都尽量将逻辑封装在类的内部。对外除了提供的public方法，不对外泄露任何信息。
4. 迪米特法则还有个更简单的定义：只与直接的朋友通信。

迪米特法则的核心是降低类之间的耦合
但是注意：由于每个类都减少了不必要的依赖，因此迪米特法则只是要求降低类间（对象间）耦合关系，并不是要求完全没有依赖关系。

###7.合成复用原则
原则是尽量使用合成/聚合的方式，而不是使用继承

###8.设计模式核心思想
1. 找出应用中可能需要变化之处，把它们独立出来，不要和那些不需要变换的代码混在一起。
2. 针对接口编程，而不是针对实现编成。
3. 为了交互对象之间的松耦合设计而努力。

##设计模式类型
设计模式分为3中类型，共23种：
1. 创建型模式：单例模式，抽象工厂模式， 原型模式，建造者模式，工厂模式；
2. 结构型模式；适配器模式，桥接模式，装饰模式，组合模式，外观模式，享元模式，代理模式；
3. 行为型模式：模板方法模式，命令模式，访问者模式，迭代器模式，观察者模式，中介者模式，备忘录模式，解释器模式（Interpreter模式），状态模式，策略模式，职责链模式（责任链模式）










##单例设计模式介绍
所谓类的单例设计模式，就是采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例，并且该类只提供一个取得其对象实例的方法(静态方法)。单例设计模式八种方式单例模式有八种方式：
* 饿汉式(静态常量)
* 饿汉式（静态代码块）
* 懒汉式(线程不安全)
* 懒汉式(线程安全，同步方法)
* 懒汉式(线程安全，同步代码块)
* 双重检查
* 静态内部类
* 枚举
