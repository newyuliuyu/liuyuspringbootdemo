package com.liuyu.user;

import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * ClassName: XmlBeanFactoryTest <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-24 下午4:00 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
public class XmlBeanFactoryTest {

    @Test
    public void test() throws Exception {
        ClassPathResource resource = new ClassPathResource("test.xml");
        XmlBeanFactory beanFactory = new XmlBeanFactory(resource);
        Object obj =beanFactory.getBean("testBean");
        System.out.println();
    }

    @Test
    public void test2() throws Exception {
        String path = "test.xml";

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(path);
//        ApplicationContext context1 = new ClassPathXmlApplicationContext(path);


        Object obj = context.getBean("testBean");
        System.out.println();
//        context.refresh();
//        Object obj2 = context.getBean("testBean");
//        System.out.println();
    }
}
