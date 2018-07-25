package com.liuyu.user;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * ClassName: AtomicBooleanTest <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-23 下午5:18 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
public class AtomicBooleanTest {

    @Test
    public void test() throws Exception{
        AtomicBoolean bool = new AtomicBoolean(false);

        System.out.println(bool.compareAndSet(false,true));
        System.out.println(bool.compareAndSet(false,true));
    }
}
