package com.liuyu.user.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * ClassName: Role <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-18 下午3:48 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
@Setter
@Getter
@ToString
@EqualsAndHashCode(of = "id")
public class Role {
    private long id;
    private String name;
    private String code;
    private boolean valid;
}
