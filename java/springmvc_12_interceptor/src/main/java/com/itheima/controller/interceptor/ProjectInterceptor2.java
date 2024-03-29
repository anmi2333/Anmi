package com.itheima.controller.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @projectName: springmvc_01_quickstart
 * @package: com.itheima.controller.interceptor
 * @className: Projectlnterceptor
 * @NAME: WANG CHAO
 * @date: 2023/09/05 14:33
 */
@SuppressWarnings({"all"})
@Component
public class ProjectInterceptor2 implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        String contentType = request.getHeader("Content-Type");
//        HandlerMethod hm = (HandlerMethod) handler;
        //hm.getMethod().getName();
        //System.out.println(handler);
        System.out.println("preHandle...222");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle...222");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion...222");
    }
}
