package cn.itcast.web.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * @projectName: javaweb07_case
 * @package: cn.itcast.web.filter
 * @className: SensitivewordsFilter
 * @NAME: WANG CHAO
 * @date: 2023/08/18 15:08
 * 敏感过滤器
 */
@SuppressWarnings({"all"})
public class SensitivewordsFilter implements Filter {
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //1.创建代理对象增强getParameter
        ServletRequest proxy_req = (ServletRequest) Proxy.newProxyInstance(servletRequest.getClass().getClassLoader(), servletRequest.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //增强getParameter方法
                //判断是否getParameter方法
                if (method.getName().equals("getParameter")){
                    //增强返回值
                    //获取返回值
                    String value = (String) method.invoke(servletRequest, args);
                    if (value != null) {
                        for (String str : list) {
                            if (value.contains(str)) {
                                value = value.replaceAll(str,"***");
                            }
                        }
                    }
                    return value;
                }
                    return method.invoke(servletRequest,args);
            }
        });
        //2.放行
        filterChain.doFilter(proxy_req,servletResponse);
    }

    private List<String> list = new ArrayList<String>();//敏感词汇集合
    public void init(FilterConfig filterConfig) throws ServletException {
        try {
        //1.获取文件真实路径文件
        ServletContext servletContext = filterConfig.getServletContext();
        String realPath = servletContext.getRealPath("/WEB-INF/classes/敏感词汇txt");
        //2.读取文件
            BufferedReader br = new BufferedReader(new FileReader(realPath));
        //3.将文件每一行数据添加到list中
            String line = null;
            while ((line = br.readLine()) != null ) {
                list.add(line);
            }
            br.close();
            System.out.println(list);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void destroy() {

    }
}
