package com.itheima.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @projectName: spring03_bean_instance
 * @package: com.itheima.aop
 * @className: MyAdvice
 * @NAME: WANG CHAO
 * @date: 2023/09/01 22:14
 */
@SuppressWarnings({"all"})

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void com.itheima.dao.BookDao.update())")
    private void pt(){}

    @Before("pt()")
    public void method() {
         System.out.println(System.currentTimeMillis());
    }
}
