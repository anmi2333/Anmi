package com.itheima.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @projectName: spring03_bean_instance
 * @package: com.itheima.aop
 * @className: ProjectAdvice
 * @NAME: WANG CHAO
 * @date: 2023/09/02 11:35
 */
@SuppressWarnings({"all"})
@Component
@Aspect
public class ProjectAdvice {
    //匹配业务层的所有方法
    @Pointcut("execution(* com.itheima.service.*Service.*(..))")
    private void servicePt(){};
    @Around("ProjectAdvice.servicePt()")
    public void runSpeed(ProceedingJoinPoint pjp) throws  Throwable{
        Signature signature = pjp.getSignature();
        System.out.println(signature.getDeclaringType());
        System.out.println(signature.getName());

        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
        pjp.proceed();
        }
       long end = System.currentTimeMillis();
        System.out.println("业务层接万次执行时间: " + (end-start) + "ms");
    }

}
