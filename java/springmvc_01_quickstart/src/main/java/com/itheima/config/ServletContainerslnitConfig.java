package com.itheima.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

import java.lang.annotation.Annotation;

/**
 * @projectName: springmvc_01_quickstart
 * @package: com.itheima.config
 * @className: ServletContainerslnitConfig
 * @NAME: WANG CHAO
 * @date: 2023/09/02 20:24
 */
@SuppressWarnings({"all"})
public class ServletContainerslnitConfig extends AbstractDispatcherServletInitializer {
 @Override
 protected WebApplicationContext createServletApplicationContext() {
  AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
  ctx.register(SpringMvcConfig.class);
  return ctx;
 }

 @Override
 protected String[] getServletMappings() {
  return new String[]{"/"};
 }

 @Override
 protected WebApplicationContext createRootApplicationContext() {
  return null;
 }
}
