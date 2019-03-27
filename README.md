[java技术驿站](http://cmsblogs.com/?cat=15)
[炸斯特](https://blog.csdn.net/jason0539/article/details/44956775)
# DesignMode
## **1.策略模式(开闭原则)**
#### **背景**
在软件开发中常常遇到这种情况，实现某一个功能有多种算法或者策略，我们可以根据环境或者条件的不同选择不同的算法或者策略来完成该功能.
#### **组成**
* 环境类(Context):用一个ConcreteStrategy对象来配置。维护一个对Strategy对象的引用。可定义一个接口来让Strategy访问它的数据。
* 抽象策略类(Strategy):定义所有支持的算法的公共接口。 Context使用这个接口来调用某ConcreteStrategy定义的算法。
* 具体策略类(ConcreteStrategy):以Strategy接口实现某具体算法。
## **2.装饰者模式**
#### **参与者**
* Component: 抽象构件。是定义一个对象接口，可以给这些对象动态地添加职责。
* ConcreteComponent:具体构件。是定义了一个具体的对象，也可以给这个对象添加一些职责。
* Decorator: 抽象装饰类。是装饰抽象类，继承了Component,从外类来扩展Component类的功能，但对于Component来说，是无需知道Decorator存在的。
* ConcreteDecorator:具体装饰类，起到给Component添加职责的功能。
## **3.门面模式**
##### **参与者**
* Facade: 外观角色。知道哪些子系统类负责处理请求，将客户的请求代理给适合的子系统处理。
* SubSystem:子系统角色。实现子系统功能，处理Facade对象发来的请求。