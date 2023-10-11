package com.itheima;

import com.itheima.config.SpringConfig;
import com.itheima.controller.UserController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.text.Annotation;

/**
 * @projectName: springmvc_01_quickstart
 * @package: com.itheima
 * @className: App
 * @NAME: WANG CHAO
 * @date: 2023/09/02 22:00
 */
@SuppressWarnings({"all"})
public class App {
 public static void main(String[] args) {
  AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
  //ctx.register(SpringConfig.class);
  ctx.refresh();
  System.out.println(ctx.getBean(UserController.class));
 }
}
