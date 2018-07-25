package com.liuyu.user.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * ClassName: RoleResource <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-18 下午4:11 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = {"role", "resource"})
public class RoleResource {
    private Role role;
    private Resource resource;
    private String codeValue;
}
