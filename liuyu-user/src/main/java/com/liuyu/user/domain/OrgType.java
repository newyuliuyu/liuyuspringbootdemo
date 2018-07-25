package com.liuyu.user.domain;

/**
 * ClassName: OrgLevelType <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-18 下午4:56 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
public enum OrgType {
    PROVINCE(1), CITY(2), COUNTY(3), SCHOOL(4);
    private int type;

    private OrgType(int type) {
        this.type = type;
    }


}
