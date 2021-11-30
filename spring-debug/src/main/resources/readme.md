1.FourTypeBeanTest 演示了四中创建bean的方式<br/>
2.AbstractApplicationContext中使用模板方法设计模式，参考其注释，另外参考<br>
https://zhuanlan.zhihu.com/p/263565558 <br>
https://zhuanlan.zhihu.com/p/99985852 <br>
3.BeanFactory <br> 
bean容器的根接口，定义了一些涉及bean的方法，如getBean(String name)，containsBean，isSingleton<br>
通常有三个重要的实现类，分别为 ListableBeanFactory，ConfigurableBeanFactory，HierarchicalBeanFactory. <br>
1. ListableBeanFactory<br>
 能枚举bean和beanDefinition的实现接口，包含了如：getBeanDefinitionNames，getBeanDefinitionCount

2. HierarchicalBeanFactory<br>
 父子容器基层关系的bean容器，当前容器没有bean会找父容器，之bean会覆盖父容器等
   
3. ConfigurableBeanFactory<br>
 继承自HierarchicalBeanFactory，具备父子容器能力，同时多了自己独有的“bean的配置能力”，通常为springi项目内部使用。<br>
   比如合并beanDifinition，配置类加载器，配置beanPostProcess等
    
4. AutowireCapableBeanFactory<br>
   具备自动装配的能力，正常情况下，不要使用此接口，通过暴露此功能，Spring框架之外的程序，具有自动装配等Spring的功能。<br>
   ApplicationContext接口并没有实现此接口，因为应用代码很少用到此功能，如果确实需要的话，可以调用ApplicationContext的getAutowireCapableBeanFactory方法，来获取此接口的实例。
5. ConfigurableListableBeanFactory<br>
   Configurable和Listable，Autowire接口功能的合体
6. AbstractBeanFactory<br>
   ConfigurableBeanFactory的抽象实现之类，具备该接口的全部能力，实现了getBean,提供了getBeanDefinition和createBean模板方法<br>
   同时提供了单例缓存该类提供一个单例缓存
7. AbstractAutowireCapableBeanFactory<br>
   继承了AbstractBeanFactory的createBean方法之外，还实现AutowireCapableBeanFactory接口，提供bean创建（具有构造函数解析）、属性填充、连接（包括自动注入）和初始化。处理运行时bean引用、解析托管集合、调用初始化方法等。
   <br>支持自动关联构造函数、按名称的属性和按类型的属性。<br>
   子类要实现的主要模板方法是resolveDependency（DependencyDescriptor、String、Set、TypeConverter）
    
8. DefaultListableBeanFactory<br>
   继承自 AbstractAutowireCapableBeanFactory
   实现了 ConfigurableListableBeanFactory, BeanDefinitionRegistry。因此具备了上述类和接口的能力，即多了beanDefiniton的增删改查的能力