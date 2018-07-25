package com.liuyu.user.service.impl;

import com.liuyu.user.domain.User;
import com.liuyu.user.domain.UserType;
import com.liuyu.user.service.UserServcie;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * ClassName: UserServcieImplTest <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-19 上午9:54 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServcieImplTest {

    @Autowired
    private UserServcie userServcie;
    @Test
    public void add() throws Exception {
        User user =  new User();
        user.setUserCode("userCode");;
        user.setPhone("phone");
        user.setEmail("email");
        user.setPassworld("passworld");
        user.setNickName("nickName");
        user.setUserType(UserType.Teacher);

        userServcie.add(user);
    }
}