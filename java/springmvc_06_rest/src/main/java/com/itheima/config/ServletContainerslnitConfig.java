package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

import javax.servlet.Filter;
import java.lang.annotation.Annotation;

/**
 * @projectName: springmvc_01_quickstart
 * @package: com.itheima.config
 * @className: ServletContainerslnitConfig
 * @NAME: WANG CHAO
 * @date: 2023/09/02 20:24
 */
@SuppressWarnings({"all"})
public class ServletContainerslnitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
 protected Class<?>[] getServletConfigClasses() {
  return new Class[] {SpringMvcConfig.class};
 }

 protected String[] getServletMappings() {
  return new String[]{"/"};
 }

 protected Class<?>[] getRootConfigClasses() {
  return new Class[0];
 }
 //中文乱码处理

 protected Filter[] getSevrletFilters() {
  CharacterEncodingFilter filter = new CharacterEncodingFilter();
  filter.setEncoding("uriencoding=utf-8");
  return new Filter[]{filter};

 }
}
