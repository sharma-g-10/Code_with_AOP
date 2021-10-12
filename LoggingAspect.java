package com.shivangi.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect
{

	@AfterThrowing(
			pointcut = "execution(* com.shivangi.service.studentService.*Student())", 
			throwing = "exception")
	public void logAfterThrowing(JoinPoint joinPoint, 
			Throwable exception)
	{
		System.out.println("exception = " + exception);
	}
	
}
