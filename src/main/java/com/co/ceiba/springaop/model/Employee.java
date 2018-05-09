package com.co.ceiba.springaop.model;

import com.co.ceiba.springaop.aspect.Loggable;

public class Employee {

	private String name;

	public String getName() {
		return name;
	}

	@Loggable
	public void setName(String name) {
		this.name = name;
	}

	public void throwException() {
		throw new RuntimeException("Dummy Exception");
	}

}
