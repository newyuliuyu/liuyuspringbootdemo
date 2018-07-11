package com.liuyu.commons.sort;

import org.junit.Test;

/**
 * ClassName: InsertionSortTest <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-10 下午3:33 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
public class InsertionSortTest {
    @Test
    public void sort1() throws Exception {
        Integer[] dataset = new Integer[]{6, 5, 3, 1, 8, 7, 2, 4};
        new InsertionSort<Integer>(dataset).sort((Integer o1, Integer o2) -> o1.compareTo(o2));
        for (Integer i : dataset) {
            System.out.println(i);
        }
    }
}