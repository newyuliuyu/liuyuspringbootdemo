package com.liuyu.commons.sort;

import org.junit.Test;

/**
 * ClassName: BubbleSortTest <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-10 下午2:54 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
public class BubbleSortTest {

    @Test
    public void sort1() throws Exception{
        Integer[] dataset=new Integer[]{6, 5, 3, 1, 8, 7, 2, 4};
        new BubbleSort<Integer>(dataset).sort((Integer o1,Integer o2)->o2.compareTo(o1));
        for(Integer i:dataset){
            System.out.println(i);
        }
    }
    @Test
    public void sort2() throws Exception{
        Integer[] dataset=new Integer[]{6, 5, 3, 1, 8, 7, 2, 4};
        new BubbleSort<Integer>(dataset).cocktailSort((Integer o1,Integer o2)->o2.compareTo(o1));
        for(Integer i:dataset){
            System.out.println(i);
        }
    }
}