package com.liuyu.user.mm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: B <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-16 下午3:49 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
@Service
public class B {
    @Autowired
    private IC c;

    public void method() {
        System.out.println("bbbbbbbbbbb=" + c.method());
    }
}
