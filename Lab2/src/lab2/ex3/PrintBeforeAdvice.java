package lab2.ex3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class PrintBeforeAdvice {
	
	@Around("execution(* lab2.ex3.Product.* (..))")
	public void before(ProceedingJoinPoint joinPoint) {
		System.out.println("This is PrintBeforeAdvice Message : " +
	                       joinPoint.getSignature().getDeclaringTypeName() + 
	                       "." + joinPoint.getSignature().getName() );
		long start = System.nanoTime();
		
		try {
			joinPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long end = System.nanoTime();
		
		System.out.println("Time : " + (end - start));
	}
}
