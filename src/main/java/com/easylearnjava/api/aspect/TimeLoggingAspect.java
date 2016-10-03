package com.easylearnjava.api.aspect;

import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TimeLoggingAspect {
	
	@Pointcut("execution(* com.easylearnjava.api.controller.HelloWorldController.*(..))")
	public void pointcutName(){
		
	}
	
	 @After("pointcutName()")//applying pointcut on before advice  
	    public void myadvice(JoinPoint jp)
	    {  
	        System.out.println("my after advice... 1111111111111111111111111");  
	    }
}