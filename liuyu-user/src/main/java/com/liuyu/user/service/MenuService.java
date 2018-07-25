package com.liuyu.user.service;

import com.liuyu.user.domain.Menu;
import com.liuyu.user.domain.User;

import java.util.List;

/**
 * ClassName: Menu <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-18 下午1:28 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
public interface MenuService {
    
    List<Menu> feachMenus(User user, String code, String category);

    List<Menu> feachMenus(User user, String code);
}
