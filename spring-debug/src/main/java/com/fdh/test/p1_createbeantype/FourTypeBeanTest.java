package com.fdh.test.p1_createbeantype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 演示了bean的四种创建方式<p></p>
 * 1、xml文件的bean标签
 * 2、@bean注解（方法上）
 * 3、@Component类上注解
 * 4、BeanDefinition的定义信息创建
 *
 * @author: fudaohui
 * @date: 2021-11-04 17:54
 */

public class FourTypeBeanTest {

	public static void main(String[] args) {
		//1、方法1xml文件的bean标签
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		//2、@bean注解,扫描basePackage下的@bean标签
//		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
//		applicationContext.register(BeanConfig.class);
//		applicationContext.refresh();
		//3、包扫描+@Component
//		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.fdh.test.part1");

		//4、BeanDefinition的定义信息创建
//		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
//		AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
//		beanDefinition.setBeanClass(Student.class);
//		applicationContext.registerBeanDefinition("student",beanDefinition);
//		applicationContext.refresh();


		//打印
		Student student =  applicationContext.getBean("student",Student.class);
		System.out.println(student.toString());

	}
}
