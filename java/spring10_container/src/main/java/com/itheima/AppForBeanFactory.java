package com.itheima;

import com.itheima.dao.BookDao;
import com.itheima.dao.impl.BookDaoImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @projectName: spring03_bean_instance
 * @package: com.itheima
 * @className: AppForBeanFactory
 * @NAME: WANG CHAO
 * @date: 2023/08/31 16:38
 */
@SuppressWarnings({"all"})
public class AppForBeanFactory {
    public static void main(String[] args) {
    Resource resoures = new ClassPathResource("applicationContext.xml");
    BeanFactory bf = new XmlBeanFactory(resoures);
        BookDao bookDao = bf.getBean(BookDao.class);
        bookDao.save();
    }
}
