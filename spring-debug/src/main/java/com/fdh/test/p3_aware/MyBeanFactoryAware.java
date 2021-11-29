package com.fdh.test.p3_aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/**
 * 自定义实现BeanFactoryAware<br>
 *
 * @author: fudaohui
 * @date: 2021-11-29 9:46
 */
public class MyBeanFactoryAware implements BeanFactoryAware {

	private BeanFactory beanFactory;

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

		this.beanFactory = beanFactory;
	}

	public BeanFactory getBeanFactory() {
		return beanFactory;
	}
}
