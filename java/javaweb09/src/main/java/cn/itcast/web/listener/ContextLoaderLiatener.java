package cn.itcast.web.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @projectName: javaweb07_case
 * @package: cn.itcast.web.listener
 * @className: ContextLoaderLiatener
 * @NAME: WANG CHAO
 * @date: 2023/08/18 15:52
 */
@SuppressWarnings({"all"})
public class ContextLoaderLiatener implements ServletContextListener {
    /**
     * 监听ServletContext对象创建的.  ServletContext对象服务器启动后自动创建的
     * 在服务器启动后自动调用
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //加载资源文件
        //1.获取servletcontext对象
        ServletContext servletContext = sce.getServletContext();
        //2.加载资源文件
        String initParameter = servletContext.getInitParameter("contextConfigLocation");
        //3.获取真实路径
        String realPath = servletContext.getRealPath(initParameter);
        //4
        try {
            FileInputStream fis = new FileInputStream(realPath);
            System.out.println(fis);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("ServletContext对象被创建了...");
    }
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ServletContext对象被销毁了...");
    }
}
