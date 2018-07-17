package com.liuyu.user.mm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: A <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-16 下午3:48 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
@Service
public class A {
    @Autowired
    private B b;

    public void method() {
        S s = new S();
        System.out.println("S.mm=====" + S.mm());
        System.out.println("S.my1=====" + s.getMy1());
        System.out.println("S.my2=====" + S.getMy2());
        System.out.println("AAAAAAAAAAAAa");
        b.method();
    }

}
