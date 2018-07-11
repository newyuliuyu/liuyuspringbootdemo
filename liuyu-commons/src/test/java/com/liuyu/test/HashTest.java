package com.liuyu.test;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * ClassName: HashTest <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-10 上午9:46 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
public class HashTest {

    @Test
    public void test1() throws Exception {
        String ip1="192.168.1.1";
        String ip2="192.168.1.2";
        String ip3="192.168.1.3";

        System.out.println(new HashCodeBuilder().append(ip1).toHashCode());
        System.out.println(new HashCodeBuilder().append(ip2).toHashCode());
        System.out.println(new HashCodeBuilder().append(ip3).toHashCode());
        Double vlaue  = Math.pow(2,32);
        System.out.println(vlaue.longValue());

        ArrayList<String> data = Lists.newArrayList();
        data.iterator();
        data.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
        Collections.sort(data, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
    }

    @Test
    public void arryListTest() throws Exception{
        ArrayList<Integer> data = Lists.newArrayList(1,2,3,4,5);
//        for(Iterator<String> it =  data.iterator();it.hasNext();){
//            //it.remove();
//            System.out.println(it.next());
//            it.remove();
//        }

        Comparator<Integer> c = (Integer o1,Integer o2)->o2.compareTo(o1);
        data.sort(c);
        System.out.println(data.size());
    }
    @Test
    public void arryListTest2() throws Exception{
        ArrayList<Integer> data = Lists.newArrayList(1,2,3,4,5);
        data.stream();
        int[] data2 = new int[]{1,2,3,4,5};
        Arrays.stream(data2);
    }
}
