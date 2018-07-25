package com.liuyu.user.domain;

/**
 * ClassName: UserType <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-18 下午5:50 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
public enum UserType {
    Teacher(1), Student(2);

    private int type;

    private UserType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type + "";
    }
}
