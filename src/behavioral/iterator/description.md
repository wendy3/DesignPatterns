### 迭代器模式

#### 描述

#### 应用场景
1、访问一个聚合对象的内容而无需暴露它的内部表示
2、支持对聚合对象的多种遍历
3、为遍历不同的聚合结构提供一个统一的接口
4、例如：java原生为List、Map等集合提供了迭代器

#### 优缺点
优点：
1、简化了遍历方式
2、可以提供多种遍历方式
3、封装性良好

缺点：
1、对于比较简单的遍历，使用迭代器方式遍历较为繁琐