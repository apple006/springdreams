package com.springDreamsProj.logging;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Aspect
@Service
public class Logger {

    @Pointcut("execution(* getUserList(..))")
    public void log() {}

    @Around("log()")
    public void logShowOffers(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("showOffers executionIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");

        joinPoint.proceed();
        
        System.out.println("showOffers executionJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ");
        
        
    }



}
