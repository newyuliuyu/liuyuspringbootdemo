package com.liuyu.user.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

/**
 * ClassName: MybatisConfig <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-3-22 上午11:29 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
//@Configuration
//@MapperScan(basePackages = {"com.liuyu.demo.dao"}, sqlSessionFactoryRef = "sqlSessionFactoryBean")
public class MybatisConfig {


//    @Autowired
//    @Qualifier("ds")
//    private DataSource ds;

    @Bean(name = "sqlSessionFactoryBean")
    public SqlSessionFactoryBean sqlSessionFactoryBean() throws Exception {
        ResourcePatternResolver resourceResolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = resourceResolver.getResources("classpath*:com/liuyu/**/dao/*.xml");
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//        bean.setDataSource(ds);


        bean.setMapperLocations(resources);
        return bean;
    }
}
