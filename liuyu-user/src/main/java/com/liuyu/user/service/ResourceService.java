package com.liuyu.user.service;

import com.liuyu.user.domain.Role;
import com.liuyu.user.domain.RoleResource;
import com.liuyu.user.domain.User;
import com.liuyu.user.domain.UserResource;

import java.util.List;

/**
 * ClassName: Permission <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-18 下午1:28 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
public interface ResourceService {

    List<UserResource> fetchUserResources(User user);

    List<RoleResource> fetchRoleResources(Role role);
}
