package com.liuyu.user.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * ClassName: Clazz <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-18 下午5:02 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
@Setter
@Getter
@ToString
@EqualsAndHashCode(of={"school","code","grade"})
public class Clazz {
    private School school;
    private String code;
    private String name;
    private int wl;
    private Grade grade;
    private String categroy;
}
