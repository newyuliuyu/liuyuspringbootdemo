package com.liuyu.springboot.liuyuweb;

import org.junit.Test;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

/**
 * ClassName: InetAddressTest <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-4 上午11:28 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
public class InetAddressTest {

    @Test
    public void newObj() throws Exception{
//        InetAddress a = InetAddress.getLocalHost();
        InetAddress a = InetAddress.getByName("demo.com");
        System.out.println(a.getHostAddress());
        System.out.println(a.getHostName());

    }
    @Test
    public void NetworkInterface() throws Exception{
//        InetAddress a = InetAddress.getLocalHost();
        Enumeration<NetworkInterface> en = NetworkInterface.getNetworkInterfaces();
        while (en.hasMoreElements()){
            NetworkInterface nif = en.nextElement();
            Enumeration<InetAddress> enumIpAddr = nif.getInetAddresses();
            while (enumIpAddr.hasMoreElements()){
                InetAddress inetAddress =enumIpAddr.nextElement();

                System.out.println(inetAddress.getHostAddress()+"====="+inetAddress.getHostName());
                if(inetAddress.isAnyLocalAddress()){
                    System.out.println("isAnyLocalAddress");
                }
                if(inetAddress.isLinkLocalAddress()){
                    System.out.println("isLinkLocalAddress");
                }
                if(inetAddress.isLoopbackAddress()){
                    System.out.println("isLoopbackAddress");
                }
                if(inetAddress.isSiteLocalAddress()){
                    System.out.println("isSiteLocalAddress");
                }

            }
        }

    }
}
