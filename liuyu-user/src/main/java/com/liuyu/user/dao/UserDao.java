package com.liuyu.user.dao;

import com.liuyu.user.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ClassName: UserDao <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-18 下午5:40 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
@Repository
public interface UserDao {
    User get(@Param("userId") long userId);

    User getUserWithCode(@Param("userCode") String userCode);

    User getUserWithPhone(@Param("phone") String phone);

    User getUserWithEmail(@Param("email") String email);

    void add(@Param("user") User user);

    void update(@Param("user") User user);

    void updatePassworld(@Param("user") User user);

    List<User> list();
}
