package com.liuyu.user;

import org.junit.Test;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.util.AntPathMatcher;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

/**
 * ClassName: TestScanPackageTest <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-13 下午3:55 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
public class TestScanPackageTest {

    @Test
    public void test1() throws Exception {
        String pages = "liuyu/springboot/liuyuuser";
        pages = "/freemarker/debug";
        pages = "/version.properties";
        Enumeration<URL> urls = findAllClassPathResources(pages);
        while (urls.hasMoreElements()) {
            URL url = urls.nextElement();
            System.out.println(url.toString());
        }


//        URL url1 = Resources.getResource("/");
        System.out.println("******************************************");
        System.out.println(TestScanPackageTest.class.getResource(""));
        System.out.println(TestScanPackageTest.class.getResource("/freemarker/version.properties"));
        System.out.println("******************************************");
        System.out.println(TestScanPackageTest.class.getClassLoader().getResource("freemarker/version.properties"));
        System.out.println(TestScanPackageTest.class.getClassLoader().getResource("/"));
        ClassLoader cl = TestScanPackageTest.class.getClassLoader();

        System.out.println();

//        InputStream in  = TestScanPackageTest.class.getClassLoader().getResourceAsStream("freemarker/version.properties");
//        byte[] bs=new byte[1024];
//        while (in.read(bs) != -1){
//            System.out.println(new String(bs));
//        }
        System.out.println();
    }

    @Test
    public void test2() throws Exception {
        ResourcePatternResolver resourceResolver = new PathMatchingResourcePatternResolver();
//        Resource[] resources = resourceResolver.getResources("classpath*:*/spring.provides");
        Resource[] resources = resourceResolver.getResources("classpath*:*/version.properties");
        System.out.println("58=" + (char) 58);
        System.out.println("47=" + (char) 47);
        System.out.println("42=" + (char) 42);
        System.out.println("63=" + (char) 63);

        String location = "classpath*:*/vers/**/ion.properties";
        int rootDirEnd = location.length();
        int prefixEnd = location.indexOf(':') + 1;
        for (rootDirEnd = location.length();
             rootDirEnd > prefixEnd && isPattern(location.substring(prefixEnd, rootDirEnd)); ) {
            System.out.println(location.substring(0, rootDirEnd - 1));
            System.out.println(location.substring(0, rootDirEnd - 2));
            rootDirEnd = location.lastIndexOf(47, rootDirEnd - 2) + 1;
            System.out.println(rootDirEnd);
        }

        if (rootDirEnd == 0) {
            rootDirEnd = prefixEnd;
        }
        System.out.println(location.substring(0, rootDirEnd));


    }

    public boolean isPattern(String path) {
        return path.indexOf(42) != -1 || path.indexOf(63) != -1;
    }

    @Test
    public void test3() throws Exception {
        String matcherStr="/**/abc/**/*.txt";
        String path="/m/abc/ab/c/kk.txt";
        AntPathMatcher matcher = new AntPathMatcher();
        System.out.println(matcher.match(matcherStr,path));
    }


    protected Enumeration<URL> findAllClassPathResources(String path) throws IOException {
        if (path.startsWith("/")) {
            path = path.substring(1);
        }

        Enumeration<URL> urls = TestScanPackageTest.class.getClassLoader().getResources(path);
        return urls;
    }
}
