package com.liuyu.user;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.junit.Test;

/**
 * ClassName: ShiroSubject <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-18 下午4:16 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
public class ShiroSubject {

    @Test
    public void readSubjectSource() throws Exception {
        Subject subject = SecurityUtils.getSubject();
        subject.isPermitted("ss");
    }
}
