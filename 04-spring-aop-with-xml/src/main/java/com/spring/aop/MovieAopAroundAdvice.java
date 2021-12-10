package com.spring.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

// Step 2: Create Advice
public class MovieAopAroundAdvice implements MethodInterceptor{
	
	@Override
	public Object invoke(MethodInvocation invoked) throws Throwable {
		try {
			// ADVICE BEFORE
			LOG("***** ADVICE BEFORE >> " + invoked.getMethod().getName());
			
			Object result = invoked.proceed();
			
			// ADVICE AFTER
			LOG("***** ADVICE AFTER >> " + result);
			
			return result;
		} catch (Exception e) {
			// ADVICE THROW EXCEPTION
			e.printStackTrace();
			throw e;
		}
	}
	
	private static void LOG(String text) {
		System.out.println(text);
	}
}
