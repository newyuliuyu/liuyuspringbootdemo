package com.liuyu.user.service;

import com.liuyu.user.domain.School;

import java.util.List;

/**
 * ClassName: SchoolService <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-25 下午1:32 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
public interface SchoolService {

    School get(String code);

    List<School> fetchSchoolWithCodes(String ...code);

    List<School> fetchCountySchool(String countyCode);

    List<School> fetchCitySchool(String cityCode);

    List<School> fetchProviceSchool(String proviceCode);
    
}
