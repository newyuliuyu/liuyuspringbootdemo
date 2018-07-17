package com.liuyu.user.mm;

import org.junit.Test;

/**
 * ClassName: MockForPublicStaticDemo <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-16 下午5:31 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
public class MockForPublicStaticDemo {

    @Test
    public void test01() throws Exception{
        String str1 = "abc";
        String str2 = new String("abc");



        String str3 = "123";
        String str4 = "abc123";
        String str5 = "abc" + "123";
        String str = str1 + str3;
        System.out.println(str4 == str5);// true
        System.out.println(str4 == str1+"123");// false
        System.out.println(str4 == str);// false
    }
}
