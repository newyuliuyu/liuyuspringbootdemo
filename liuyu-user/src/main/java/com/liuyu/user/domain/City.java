package com.liuyu.user.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * ClassName: City <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-25 上午11:16 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
@Setter
@Getter
@ToString
@EqualsAndHashCode(of = "code")
public class City extends Organization {
    public City(){}
    public City(Organization organization){
        setId(organization.getId());
        setCode(organization.getCode());
        setName(organization.getName());
        setParentCode(organization.getParentCode());
        setProvinceCode(organization.getProvinceCode());
    }
}
