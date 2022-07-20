package com.aop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class AspectAop {
    @Before("@annotation(com.aop.annotation.MyAnnotatio)")
    public void loggi(JoinPoint joinPoint){
        log.info("Delay loggi: " + joinPoint.getSignature().getName());
    }

}
