package com.liuyu.user.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * ClassName: Subject <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-25 上午11:26 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = {"id"})
public class Subject {
    private int id;
    private String name;
    private int orderNum;
}
