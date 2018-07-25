package com.liuyu.user.service;

import com.liuyu.user.domain.County;

import java.util.List;

/**
 * ClassName: CountyService <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-25 下午1:40 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
public interface CountyService {

    County get(String code);

    List<County> fetchCountyWithCodes(String ...codes);

    List<County> fetchCityCounty(String cityCode);

    List<County> fetchProvinceCounty(String provinceCode);
}
