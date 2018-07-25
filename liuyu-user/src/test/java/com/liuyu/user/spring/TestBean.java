package com.liuyu.user.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * ClassName: TestBean <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-24 下午4:02 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
public class TestBean implements BeanNameAware,BeanFactoryAware,InitializingBean,DisposableBean{
    private String name;
    private int age;
    public TestBean(){
        System.out.println("=====TestBean.TestBean()====");
    }
    public String getName() {

        return name;
    }

    public void setName(String name) {
        System.out.println("=====TestBean.setName()====");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("===== BeanNameAware.setBeanName======");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("===== BeanFactoryAware.setBeanFactory======");


    }

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("===== InitializingBean.afterPropertiesSet======");
    }

    public void myInitMetho(){
        System.out.println("===== TestBean.myInitMetho======");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("===== DisposableBean.destroy======");
    }

    public void myDestroy() throws Exception {
        System.out.println("===== TestBean.myDestroy======");
    }
}
