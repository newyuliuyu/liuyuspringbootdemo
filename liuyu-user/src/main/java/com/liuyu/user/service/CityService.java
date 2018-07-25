package com.liuyu.user.service;

import com.liuyu.user.domain.City;

import java.util.List;

/**
 * ClassName: CityService <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-25 下午1:42 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
public interface CityService {

    City get(String code);

    List<City> fetchCityWithCodes(String ...codes);

    List<City> fetchProviceCity(String provinceCode);

}
