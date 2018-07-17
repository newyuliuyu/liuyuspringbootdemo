package com.liuyu.test;

import com.google.common.collect.Lists;
import com.sun.management.OperatingSystemMXBean;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.junit.Test;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        String ip1 = "192.168.1.1";
        String ip2 = "192.168.1.2";
        String ip3 = "192.168.1.3";

        System.out.println(new HashCodeBuilder().append(ip1).toHashCode());
        System.out.println(new HashCodeBuilder().append(ip2).toHashCode());
        System.out.println(new HashCodeBuilder().append(ip3).toHashCode());
        Double vlaue = Math.pow(2, 32);
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
    public void arryListTest() throws Exception {
        ArrayList<Integer> data = Lists.newArrayList(1, 2, 3, 4, 5);
//        for(Iterator<String> it =  data.iterator();it.hasNext();){
//            //it.remove();
//            System.out.println(it.next());
//            it.remove();
//        }

        Comparator<Integer> c = (Integer o1, Integer o2) -> o2.compareTo(o1);
        data.sort(c);
        System.out.println(data.size());
    }

    @Test
    public void arryListTest2() throws Exception {
        ArrayList<Integer> data = Lists.newArrayList(1, 2, 3, 4, 5);
        data.stream();
        int[] data2 = new int[]{1, 2, 3, 4, 5};
        Arrays.stream(data2);
    }

    @Test
    public void arryListTest3() throws Exception {
        Car car = Car.create(Car::new);
        CarCount car2 = CarCount.create2(CarCount::new);
        final List<Car> cars = Arrays.asList(car);
        cars.forEach(Car::repair);
        cars.forEach(Car::collide);
        cars.forEach(car2::follow);
        Stream<String> s = Arrays.stream(new String[]{"a","b","c"});

        Map<String,String> mm = s.collect(Collectors.toMap(this::key,this::value,this::mege,HashMap::new));
        System.out.println();
    }

    @Test
    public void sort1() throws Exception {
        printMem();
        List<Integer> list = createData();
        long b=System.currentTimeMillis();
        List<Integer> list1 = list.stream().sorted(Integer::compareTo).collect(Collectors.toList());
        long e = System.currentTimeMillis();
        System.out.println((e-b)*1.0/1000+"秒");
        printMem();
    }
    @Test
    public void sort3() throws Exception {
        printMem();
        List<Integer> list = createData();
        long b=System.currentTimeMillis();
//        List<Integer> list1 = list.parallelStream().sorted(Integer::compareTo).collect(Collectors.toList());
        List<Integer> list1 = list.stream().parallel().sorted(Integer::compareTo).collect(Collectors.toList());
        long e = System.currentTimeMillis();
        System.out.println((e-b)*1.0/1000+"秒");
        printMem();
    }

    @Test
    public void sort2() throws Exception {
        printMem();
        List<Integer> list = createData();
        long b=System.currentTimeMillis();
        Collections.sort(list,Integer::compareTo);
        long e = System.currentTimeMillis();
        System.out.println((e-b)*1.0/1000+"秒");
        printMem();
    }


    private List<Integer> createData(){
        final int limit = 50000000;
        Random r =  new Random();
        List<Integer> list = new ArrayList<>(limit);
        for(int i=0;i<limit;i++){
            list.add(r.nextInt(limit));
        }
        System.out.println("============");
        return list;
    }

    private void printMem(){
        System.out.println("=====================分割线==================");
        OperatingSystemMXBean mem = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
        System.out.println("Total RAM：" + mem.getTotalPhysicalMemorySize() / 1024 / 1024 + "MB");
        System.out.println("Available　RAM：" + mem.getFreePhysicalMemorySize() / 1024 / 1024 + "MB");

        System.out.println("=====================分割线==================");
        MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
        MemoryUsage usage = memoryMXBean.getHeapMemoryUsage();
        System.out.println("INT HEAP:" + usage.getInit()/1024/1024 + "Mb");
        System.out.println("MAX HEAP:" + usage.getMax()/1024/1024 + "Mb");
        System.out.println("USED HEAP:" + usage.getUsed()/1024/1024 + "Mb");

        System.out.println("\nFull Information:");
        System.out.println("Heap Memory Usage:" + memoryMXBean.getHeapMemoryUsage());
        System.out.println("Non-Heap Memory Usage:" + memoryMXBean.getNonHeapMemoryUsage());

        List<String> inputArguments = ManagementFactory.getRuntimeMXBean().getInputArguments();
        System.out.println("=====================java options==================");
        System.out.println(inputArguments);

        System.out.println("=====================通过java来获取相关系统状态====================");
        long i = Runtime.getRuntime().totalMemory()/1024/1024;//Java 虚拟机中的内存总量，以字节为单位
        System.out.println("总的内存量为:" + i + "Mb");
        long j = Runtime.getRuntime().freeMemory()/1024/1024;//Java 虚拟机中的空闲内存量
        System.out.println("空闲内存量:" + j + "Mb");
        long k = Runtime.getRuntime().maxMemory()/1024/1024;
        System.out.println("最大可用内存量:" + k + "Mb");

    }

    public String key(String k){
        return k;
    }
    public String value(String v){
        return v;
    }
    public String mege(String k,String v){
        return k+v;
    }
}
