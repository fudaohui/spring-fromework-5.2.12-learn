package com.fdh.test.part1;

import org.springframework.stereotype.Component;

/**
 * 〈功能概述〉<br>
 *
 * @author: fudaohui
 * @date: 2021-11-16 16:06
 */

public class Person {


	protected  void  say(){
		System.out.println("Person");
	}

	public Person() {
		this.say();
	}
}
