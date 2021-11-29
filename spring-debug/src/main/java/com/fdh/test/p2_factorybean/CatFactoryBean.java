package com.fdh.test.p2_factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * 〈功能概述〉<br>
 *
 * @author: fudaohui
 * @date: 2021-11-23 18:03
 */
public class CatFactoryBean implements FactoryBean<Cat> {
	@Override
	public Cat getObject() throws Exception {
		return new Cat();
	}

	@Override
	public Class<?> getObjectType() {
		return Cat.class;
	}
}
