package com.liuyu.user.service;

import com.liuyu.user.domain.User;

/**
 * ClassName: UserServcie <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-18 下午4:45 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
public interface UserServcie {
    void add(User user);

    void update(User user);

    void updatePassworld(User user);

    User get(String usercode);

    User get(long userId);
}
