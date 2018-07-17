package com.liuyu.user.mm;

import org.springframework.stereotype.Service;

/**
 * ClassName: C <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-16 下午3:50 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
@Service
public class C implements IC {
    @Override
    public int method() {
        System.out.println("cccccccccccccccc");
        return 1;
    }
}
