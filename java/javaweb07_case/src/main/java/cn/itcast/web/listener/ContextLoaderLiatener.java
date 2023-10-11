package cn.itcast.web.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

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
        System.out.println("ServletContext对象被创建了...");
    }
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ServletContext对象被销毁了...");
    }
}
