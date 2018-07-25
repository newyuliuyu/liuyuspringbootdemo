package com.liuyu.user.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * ClassName: School <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-18 下午5:01 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
@Setter
@Getter
@ToString
@EqualsAndHashCode(of = "code")
public class School extends Organization {
    public School(){}
    public School(Organization organization){
        setId(organization.getId());
        setCode(organization.getCode());
        setName(organization.getName());
        setParentCode(organization.getParentCode());
        setCityCode(organization.getCityCode());
        setCountyCode(organization.getCountyCode());
        setProvinceCode(organization.getProvinceCode());
    }
}
