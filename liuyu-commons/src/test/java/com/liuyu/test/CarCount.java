package com.liuyu.test;

import java.util.function.Supplier;

/**
 * ClassName: Car <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-12 下午4:09 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
public class CarCount {
    private int num = 0;

    public static CarCount create2(final Supplier<CarCount> supplier) {
        return supplier.get();
    }

    public void follow(final Car another) {
        num++;
    }

}
