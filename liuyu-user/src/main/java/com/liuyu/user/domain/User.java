package com.liuyu.user.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * ClassName: User <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-18 下午3:45 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
@Setter
@Getter
@ToString(exclude = "passworld")
@EqualsAndHashCode(of = {"id"})
public class User {
    private long id=-1;
    private String userCode;
    private String phone;
    private String email;
    private String passworld;
    private String nickName;
    private UserType userType;
    private boolean valid;

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
}
