package com1.itheima.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @projectName: springmvc_01_quickstart
 * @package: com.itheima.config
 * @className: ServletContainerslnitConfig
 * @NAME: WANG CHAO
 * @date: 2023/09/02 20:24
 */
@SuppressWarnings({"all"})

public class ServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
 protected Class<?>[] getServletConfigClasses() {
  return new Class[] {SpringMvcConfig.class};
 }


 protected Class<?>[] getRootConfigClasses() {
  return new Class[]{SpringMvcConfig.class};
 }
 protected String[] getServletMappings() {
  return new String[]{"/"};
 }
 //中文乱码处理

// protected Filter[] getSevrletFilters() {
//  CharacterEncodingFilter filter = new CharacterEncodingFilter();
//  filter.setEncoding("UTF-8");
//  return new Filter[]{filter};
 }

