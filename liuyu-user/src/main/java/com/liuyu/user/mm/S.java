package com.liuyu.user.mm;

/**
 * ClassName: S <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-16 下午5:57 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
public class S {
    private String my1 = "my1";
    private static String my2 = "my2";

    public static String mm() {

        return "test";
    }

    public String getMy1() {
        System.out.println("=============privateMethod========" + privateMethod());
        System.out.println("=========privateStaticMethod============" + privateStaticMethod());
        return my1;
    }

    public static String getMy2() {
        return my2;
    }

    private String privateMethod() {
        return "privateMethod";
    }

    private static String privateStaticMethod() {
        return "privateStaticMethod";
    }
}
