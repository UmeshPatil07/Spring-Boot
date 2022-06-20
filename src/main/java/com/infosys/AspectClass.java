package com.infosys;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectClass {
	@Before("execution(public String com.infosys.Student.getsName())")
	public void beforeAdvice () {
		System.out.println("Before Advice");
	}
	
	@After("execution(public String com.infosys.Student.getsName())")
	public void afterAdvice () {
		System.out.println("After Advice");
	}
	@AfterReturning(value="execution(public String com.infosys.Student.setStudent())",returning =  "str")
	 public void afterReturning(String str) {
		System.out.println("After advice successfully executed"+str);
		
	}
		
	
}
