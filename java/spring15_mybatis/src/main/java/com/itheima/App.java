package com.itheima;

import com.itheima.config.SpringConfig;
import com.itheima.dao.AccountDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;


/**
 * @projectName: spring03_bean_instance
 * @package: com.itheima
 * @className: App
 * @NAME: WANG CHAO
 * @date: 2023/08/31 15:06
 */
@SuppressWarnings({"all"})
public class App {
    public static void main(String[] args) throws IOException {

        //1.创建对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //2.加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMpaConfig.xml.bak")
        //3.加载对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        //4.获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //5.执行查询获得结果user
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        Account ac = accountDao.findById(2);
        System.out.println(ac);
        //6.
        sqlSession.close();

    }
}
