package com.liuyu.commons.util;

import com.google.common.collect.Sets;
import org.junit.Test;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Set;

/**
 * ClassName: IdGeneratorTest <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-11 下午5:00 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
public class IdGeneratorTest {

    @Test
    public void create01() throws Exception {
        IdGenerator idGenerator = new IdGenerator(0, 0);

        Runnable runnable = () -> {
            String threadName = Thread.currentThread().getName();
            for (int i = 0; i < 100; i++) {
                long id = idGenerator.nextId();
                System.out.println(id);
                try {
                    Thread.currentThread().sleep(10);
                }catch (Exception e){

                }
            }
        };

        Thread[] threads = new Thread[20];
        for (int i = 0; i < 20; i++) {
            threads[i] = new Thread(runnable);
            threads[i].start();
        }
        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("运行完毕");
    }
    @Test
    public void create02() throws Exception {
//        IdGenerator idGenerator = new IdGenerator(0, 0);
//        long id = idGenerator.nextId();
//
//        // 111000011101000001100101111111110000000000000000000000000000
//        System.out.println(Long.toBinaryString(id));
//        System.out.println("运行完毕");


        final long sequenceMask = -1L ^ (-1L << 12);
        long sequence=0;
        for(int i=0;i<10000;i++){
            sequence = (sequence + 1) & sequenceMask;
            System.out.println(sequence);
        }

        System.out.println(sequenceMask+"=="+Long.toBinaryString(sequenceMask));
        System.out.println(Long.toBinaryString(1L>>52));
        System.out.println(Long.toBinaryString(1000));
        System.out.println(Long.parseLong("1111111111",2));
        System.out.println(Math.pow(2,5));
    }
    @Test
    public void create03() throws Exception {
        Random r = new Random();
        System.out.println(r.nextInt(100));

        DecimalFormat tmpformat = new DecimalFormat("000000");

        long sequenceMask = 10;
        long sequence=0;
        Set<Long> set  = Sets.newHashSet();
        for(int i=0;i<1000;i++){
//            sequenceMask--;
//            if(sequenceMask==0){
//                sequenceMask=100;
//            }

//            sequenceMask = r.nextInt(100);
//            sequence = (sequence + 1) | sequenceMask;
            sequence = r.nextInt(100) | r.nextInt(100);

            System.out.println(tmpformat.format(sequence));
            set.add(sequence);
        }
        System.out.println(set.size());
    }
}