package com.liuyu.user;

import com.alibaba.fastjson.serializer.SerializeConfig;
import com.liuyu.commons.json.Json2;
import com.liuyu.user.domain.User;
import com.liuyu.user.domain.UserType;
import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;

/**
 * ClassName: JsonTest <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-19 上午10:16 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
public class JsonTest {

    @Test
    public void config() throws Exception {
        SerializeConfig globalInstance = SerializeConfig.globalInstance;

    }
    @Test
    public void test() throws Exception {
        User user =  new User();
        user.setId(1L);
        user.setUserCode("userCode");;
        user.setPhone("phone");
        user.setEmail("email");
        user.setPassworld("passworld");
        user.setNickName("nickName");
        user.setUserType(UserType.Teacher);

        String json  = Json2.toJson(user);
        System.out.println(json);
    }
    @Test
    public void test2() throws Exception {
        String json  = "{\"email\":\"email\",\"id\":1,\"nickName\":\"nickName\",\"passworld\":\"passworld\",\"phone\":\"phone\",\"userCode\":\"userCode\",\"userType\":\"Teacher\",\"valid\":false}";


        User user =  Json2.fromJson(json,User.class);
        System.out.println();
    }
    @Test
    public void test3() throws Exception {
        ExecutorService executorService = Executors.newCachedThreadPool();
//        executorService.submit()

        ForkJoinPool pool = new ForkJoinPool();


    }
}
