package com.liuyu.user.service.impl;

import com.liuyu.commons.util.IdGenerator;
import com.liuyu.user.dao.UserDao;
import com.liuyu.user.domain.User;
import com.liuyu.user.service.UserServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ClassName: UserServcieImpl <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-18 下午5:40 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
@Service
public class UserServcieImpl implements UserServcie {

    @Autowired
    private UserDao userDao;
    @Autowired
    private IdGenerator idGenerator;


    @Override
    @Transactional
    public void add(User user) {
        if (user.getId() == -1) {
            user.setId(idGenerator.nextId());
        }
        userDao.add(user);
    }

    @Override
    @Transactional
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    @Transactional
    public void updatePassworld(User user) {
        userDao.updatePassworld(user);
    }

    @Override
    public User get(String usercode) {
        User user = null;
        if (user == null) {
            user = userDao.getUserWithCode(usercode);
        }
        if (user == null) {
            user = userDao.getUserWithPhone(usercode);
        }
        if (user == null) {
            user = userDao.getUserWithEmail(usercode);
        }
        return user;
    }

    @Override
    public User get(long userId) {
        return null;
    }
}
