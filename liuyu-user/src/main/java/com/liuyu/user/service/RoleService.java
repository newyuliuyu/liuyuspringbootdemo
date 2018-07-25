package com.liuyu.user.service;

import com.liuyu.user.domain.Role;
import com.liuyu.user.domain.User;

import java.util.List;

/**
 * ClassName: Role <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-18 下午1:29 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
public interface RoleService {

    List<Role> fetchUserRoles(User user);

}
