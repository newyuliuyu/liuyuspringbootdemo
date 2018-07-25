package com.liuyu.user.service;

import com.liuyu.user.domain.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * ClassName: OrganizationService <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-25 下午1:25 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
public interface OrganizationService {
    Organization get(String code);

    static Province toProvince(Organization org) {
        Province province = new Province(org);
        return province;
    }

    static List<Province> toProvinces(List<Organization> orgs) {
        return orgs.stream().map(org -> new Province(org)).collect(Collectors.toList());
    }

    static City toCity(Organization org) {
        City city = new City(org);
        return city;
    }

    static List<City> toCitys(List<Organization> orgs) {
        return orgs.stream().map(org -> new City(org)).collect(Collectors.toList());
    }

    static County toCounty(Organization org) {
        County county = new County(org);
        return county;
    }

    static List<County> toCountys(List<Organization> orgs) {
        return orgs.stream().map(org -> new County(org)).collect(Collectors.toList());
    }

    static School toSchool(Organization org) {
        School school = new School(org);
        return school;
    }

    static List<School> toSchools(List<Organization> orgs) {
        return orgs.stream().map(org -> new School(org)).collect(Collectors.toList());
    }
}
