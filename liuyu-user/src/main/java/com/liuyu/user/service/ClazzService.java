package com.liuyu.user.service;

import com.liuyu.user.domain.Clazz;

import java.util.List;

/**
 * ClassName: ClazzService <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-25 下午1:26 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
public interface ClazzService {

    Clazz get(String schoolCode, String code);

    List<Clazz> fetchSchoolClazzs(String schoolCode);

    List<Clazz> fetchSchoolClazzsWithCodes(String schoolCode, String... code);

}
