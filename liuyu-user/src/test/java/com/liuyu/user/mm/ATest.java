package com.liuyu.user.mm;

import mockit.Expectations;
import mockit.Mock;
import mockit.MockUp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * ClassName: ATest <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-16 下午3:53 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ATest {
    @Autowired
    private A a;

    @Autowired
    private IC ic;

    @Test
    public void testa() throws Exception {
        a.method();
    }

    @Test
    public void testa2() throws Exception {

//        new Expectations(){
//            {
//                Deencapsulation.setField(S.class,"my2","my1test====");
//                S.mm();result="kkkkkkkkk=-r09348489589";
//                ic.method();result=20;
//
//            }
//        };

        new Expectations(S.class){
            {
                //S s=new S();result=s;
                //s.getMy1();result="lllllllll";
                S.mm();returns("a","b","c");result="d";

            }
        };

        new MockUp<S>() {
            @Mock
            private String privateMethod() {
                return "ddd";
            }
            @Mock
            private String privateStaticMethod() {
                //私有静态方法的mock
                return "ddd====privateStaticMethod";
            }

        };

        S s = new S();
        System.out.println(s.getMy1());
        System.out.println(S.mm());
        System.out.println(S.mm());
        System.out.println(S.mm());
        System.out.println(S.mm());
        System.out.println(S.mm());


    }



}