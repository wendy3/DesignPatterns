# DesignPatterns
设计模式入门样例

# 设计模式主要遵循了六大软件设计原则，分别是：
### 1、单一职责原则
不要存在多于一个导致类变更的原因。通俗来说，就是一个类只负责一项职责。
### 2、里氏替换原则
（1）如果对每一个类型为T1的对象o1，都有类型为T2的对象o2，使得以T1定义的所有程序P在所有的对象o1都替换成o2时，程序P的行为没有发生变化，那么类型T2是类型T1的子类型。
（2）所有引用基类的地方必须能透明地使用其子类的对象。
通俗来说，子类可以扩展父类的功能，但不能改变父类原有的功能。包含以下4层含义：
- 子类可以实现父类的抽象方法，但不能覆盖父类的非抽象方法。
- 子类中可以增加自己特有的方法。
- 当子类的方法重载父类的方法时，方法的前置条件（即方法的形参）要比父类方法的输入参数更加宽松。
- 当子类的方法实现父类的抽象方法时，方法的后置条件（即方法的返回值）要比父类更加严格。
### 3、依赖倒置原则
高层模块不应该依赖低层模块，二者都应该依赖其抽象；抽象不应该依赖细节；细节应该依赖抽象。
### 4、接口隔离原则
客户端不应该依赖它不需要的接口；一个类对另一个类的依赖应该建立在最小的接口上。
### 5、迪米特法则（最少知道原则）
一个对象应该对其他对象保持最少的了解。
### 6、开闭原则
一个软件实体如类、模块和函数应该对扩展开放，对修改关闭。

接下来，让我们看看设计模式到底是哪些呢？有怎样的区分，以及怎么使用它们。
设计模式可分为3类，分别是创建型、行为型、结构型。
#### 创建型：
单例模式、工厂模式（简单工厂模式，工厂方法模式，抽象工厂模式）、建造者模式、原型模式
#### 行为型：
迭代器模式、命令模式、解释器模式、责任链模式、观察者模式、中介者模式、备忘录模式、状态模式、策略模式、模板方法模式、访问者模式
#### 结构型：
适配器模式、组合模式、代理模式、桥梁模式、装饰模式、外观模式、享元模式

#### 参考资料
http://c.biancheng.net/design_pattern/
https://segmentfault.com/a/1190000018402579?utm_source=weekly&utm_medium=email&utm_campaign=email_weekly
