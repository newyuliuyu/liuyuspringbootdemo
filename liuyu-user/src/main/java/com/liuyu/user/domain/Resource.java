package com.liuyu.user.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * ClassName: Menu <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-18 下午1:38 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
@Setter
@Getter
@ToString
@EqualsAndHashCode(of = {"id","code"})
public class Resource {
    private long id;
    private long parentId;
    private String code;
    private String category;
    private String name;
    private String url;
    private String imgUrl;
    private boolean valid;

}
