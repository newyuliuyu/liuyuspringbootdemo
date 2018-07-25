package com.liuyu.commons.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * ClassName: MemoryRealm <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-18 上午10:53 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
public class MemoryRealm extends AuthorizingRealm {

    private String userCode;
    private String passworld;

    public MemoryRealm() {
        this("test", "test");
    }

    public MemoryRealm(String userCode, String passworld) {
        this.userCode = userCode;
        this.passworld = passworld;
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //授权
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //身份验证
        SimpleAuthenticationInfo authInfo = new SimpleAuthenticationInfo(userCode, passworld, userCode);

        return null;
    }
}
