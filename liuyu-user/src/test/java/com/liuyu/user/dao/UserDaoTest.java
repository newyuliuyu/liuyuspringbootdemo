package com.liuyu.user.dao;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liuyu.commons.util.IdGenerator;
import com.liuyu.user.domain.User;
import com.liuyu.user.domain.UserType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * ClassName: UserDaoTest <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-18 下午6:32 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {
    @Autowired
    private IdGenerator idGenerator;

    @Autowired
    private UserDao userDao;


    public void initUser() throws Exception {
        for(int i=1;i<=99;i++){
            User user =  new User();
            user.setId(idGenerator.nextId());
            user.setUserCode("userCode"+i);;
            user.setPhone("phone"+i);
            user.setEmail("email"+i);
            user.setPassworld("passworld"+i);
            user.setNickName("nickName"+i);
            user.setUserType(UserType.Teacher);
            userDao.add(user);
        }

    }
    @Test
    public void add() throws Exception {
        User user =  new User();
        user.setId(idGenerator.nextId());
        user.setUserCode("userCode");
        user.setPhone("phone");
        user.setEmail("email");
        user.setPassworld("passworld");
        user.setNickName("nickName");
        user.setUserType(UserType.Teacher);
        userDao.add(user);
    }
    @Test
    public void update() throws Exception {
        User user =  new User();
        user.setId(1019762752761102336L);
        user.setUserCode("userCode111");;
        userDao.update(user);
    }
    @Test
    public void getUserWithCode() throws Exception {
        User user =  userDao.getUserWithCode("userCode");
        System.out.println();
    }
    @Test
    public void list() throws Exception {
        PageHelper.startPage(0,10);
        List<User> users = userDao.list();
        PageInfo page = new PageInfo(users);
        System.out.println(page.getPageNum());
        System.out.println(page.getPageSize());
        System.out.println(page.getStartRow());
        System.out.println(page.getEndRow());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());
        System.out.println(page.getFirstPage());
        System.out.println(page.getLastPage());
        System.out.println(page.isIsFirstPage());
        System.out.println(page.isIsLastPage());
        System.out.println(page.isHasPreviousPage());
        System.out.println(page.isHasNextPage());
        System.out.println();
    }


}