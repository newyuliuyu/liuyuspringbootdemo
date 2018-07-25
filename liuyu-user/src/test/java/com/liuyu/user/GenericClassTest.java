package com.liuyu.user;

import com.liuyu.commons.mybatis.LiuyuEnumStringTypeHandler;
import com.liuyu.user.domain.UserType;
import org.junit.Test;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * ClassName: GenericClassTest <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-19 上午9:06 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
public class GenericClassTest {

    @Test
    public void test() throws Exception {
        LiuyuEnumStringTypeHandler<UserType> handler = new LiuyuEnumStringTypeHandler<UserType>(UserType.class){};
        Type genericSuperclass = handler.getClass().getGenericSuperclass();

        Type rawType = ((ParameterizedType)genericSuperclass).getActualTypeArguments()[0];
        if (rawType instanceof ParameterizedType) {
            rawType = ((ParameterizedType)rawType).getRawType();
        }
        System.out.println();

    }
}
