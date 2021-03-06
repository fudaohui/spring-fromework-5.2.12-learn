package com.fdh.test.p2_factorybean;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * factory创建bean演示<br>
 *
 * @author: fudaohui
 * @date: 2021-11-23 18:02
 */
public class MyFactoryBeanTest {


	public static void main(String[] args) {


		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();

		AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
		beanDefinition.setBeanClass(CatFactoryBean.class);
		annotationConfigApplicationContext.registerBeanDefinition("aa",beanDefinition);
		annotationConfigApplicationContext.refresh();
		Object bean = annotationConfigApplicationContext.getBean("aa");
		System.out.println(bean);
		//----------------------------注意源码区别
		 bean = annotationConfigApplicationContext.getBean("&aa");
		System.out.println(bean);


	}
}
