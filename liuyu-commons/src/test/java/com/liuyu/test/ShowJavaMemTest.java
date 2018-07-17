package com.liuyu.test;

import com.sun.management.OperatingSystemMXBean;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.util.List;

/**
 * ClassName: ShowJavaMemTest <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-16 上午9:10 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
public class ShowJavaMemTest {

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
}
