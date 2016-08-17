

### code smell list 
* Duplicated Code (重复代码)
* Long Method (过长函数)
* Large Class (过大的类)
* Long Paramaeter List (过长的参数列表)
    通过对象进行传递，避免过程的参数
* Divergent Change (分散式变化)
* Shotgun Surgery (散弹式修改)
* Feature Enry (依恋情节)
    函数对某个类的兴趣高过自己所处类的兴趣。采用move method进行处理
* Data Clumps (数据泥团)
    成对的数据散落在各地，识别领域对象，采用Extract Class进行处理
* Primitive Obsession (基本类型偏执)
    过多的使用基本类型，数据结构来处理问题。而不是Class
* Switch Statements (switch 惊悚现身)
    switch 出现的地方往往意味着可以使用多态进行处理
* Parallel inheritance Hierachies(平行集成体系)
* Lazy Class (冗余类)
* Speculative Generality (夸夸其谈未来性)
    预先设计
* Temporary Field (令人迷惑的临时字段)
* Message Chains (过度耦合的消息链)
* Middle Man (中间人)
* Inappropriate Intimacy (亲密关系)
* Alternative Classes with Different interfaces(异曲同工的类)
* Incomplete Library Class (不完美的类库)
* Data Class (单一的数据类)
    PoJo 仅仅做数据展示，没有任何行为
* Refused Bequest (被拒绝的遗赠)
    子类继承了太多超类的属性和方法，但是很多是子类不想要的。
* Comments (过多的注释)
