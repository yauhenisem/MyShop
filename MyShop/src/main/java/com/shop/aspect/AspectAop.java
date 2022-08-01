/*package com.shop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;


@Aspect
@Component
@Slf4j
public class AspectAop {
    @Around("@annotation(com.shop.annotation.TimerAnnotation)")
    public void logMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        proceedingJoinPoint.proceed();
        stopWatch.stop();
        System.out.println(proceedingJoinPoint.getSignature().getName()+ "TOtal time: " + stopWatch.getTotalTimeMillis()+ " ms");
    }
}
*/