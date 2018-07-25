package com.liuyu.user.config;

import com.liuyu.commons.shiro.MemoryRealm;
import org.apache.shiro.realm.Realm;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: ShiroConfig <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-18 上午11:11 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
@Configuration
public class ShiroConfig {

    @Bean
    public Realm realm() {
        return new MemoryRealm();
    }

    @Bean
    public Realm realm1() {
        return new MemoryRealm("test1", "test1");
    }

    //cacheManager
    //filter
    //sessiondao
    //realm
    //sessionIdGenerator
    //sessionCookie
    //sessionDAO
    //sessionValidationScheduler
    //sessionManager
    //securityManager
    //执行方法SecurityUtils.setSecurityManager
    //ShiroFilterFactoryBean
//    <bean id="lifecycleBeanPostProcessor" class="org.apache.shiro.spring.LifecycleBeanPostProcessor"/>
//    <bean class="org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator"
//    depends-on="lifecycleBeanPostProcessor">
//        <property name="proxyTargetClass" value="true"></property>
//    </bean>

}
