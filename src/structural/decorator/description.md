### 装饰模式

#### 描述
允许向一个现有的对象添加新的功能，同时又不改变其结构。
在不想增加更多子类的情况下扩展类，动态地给一个对象添加一些额外的职责。

#### 应用场景
- 运行时，你需要动态地为对象增加额外职责时
- 当你需要一个能够代替子类的类，借助它提供额外方法时

#### 优缺点
- 优点：更灵活，很好的扩展性
- 缺点：装饰类多了，功能相似，出了问题的时候，排查需要浪费长时间。

#### 与代理模式的区别
https://www.cnblogs.com/xiaolovewei/p/7751332.html