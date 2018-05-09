package com.co.ceiba.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAnnotationAspect {

	@Before("@annotation(com.co.ceiba.springaop.aspect.Loggable)")
	public void myAdvice() {
		System.out.println("Executing myAdvice!!");
	}

}
