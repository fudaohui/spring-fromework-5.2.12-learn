package com.fdh.test.p1_createbeantype;

/**
 * 〈功能概述〉<br>
 *
 * @author: fudaohui
 * @date: 2021-11-04 17:38
 */
//@Component
public class Student  extends Person{

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				'}';
	}

	@Override
	protected void say() {
		System.out.println("Student");
	}
}
