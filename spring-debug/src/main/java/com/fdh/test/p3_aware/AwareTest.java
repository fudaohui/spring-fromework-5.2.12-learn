package com.fdh.test.p3_aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 〈功能概述〉<br>
 *
 * @author: fudaohui
 * @date: 2021-11-29 9:53
 */
public class AwareTest {


	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aware.xml");
		MyBeanFactoryAware myBeanFactoryAware = (MyBeanFactoryAware) context.getBean("myBeanFactoryAware");
		Student student = (Student) myBeanFactoryAware.getBeanFactory().getBean("student");
		System.out.println(student);

	}
}
