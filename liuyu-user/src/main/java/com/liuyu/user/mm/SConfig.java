package com.liuyu.user.mm;

import org.springframework.context.annotation.Bean;

/**
 * ClassName: SConfig <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-17 下午6:11 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
public class SConfig {

    @Bean
    public S mys() {
        return new S();
    }
}
