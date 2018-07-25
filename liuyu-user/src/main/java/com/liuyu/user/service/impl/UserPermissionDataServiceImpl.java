package com.liuyu.user.service.impl;

import com.liuyu.user.domain.*;
import com.liuyu.user.service.UserPermissionDataService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: UserPermissionDataServiceImpl <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-25 下午1:24 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
@Service
public class UserPermissionDataServiceImpl implements UserPermissionDataService {

    @Override
    public Organization fetchUserOwnOrganization(User user) {
        return null;
    }

    @Override
    public List<Clazz> fetchUserTeachClazzs(User user) {
        return null;
    }

    @Override
    public List<School> fetchUserShowSchoolReportSchools(User user) {
        return null;
    }

    @Override
    public List<City> fetchUserShowCityReportCitys(User user) {
        return null;
    }

    @Override
    public List<County> fetchUserShowCountyReportCountys(User user) {
        return null;
    }

    @Override
    public List<Province> fetchUserShowProvinceReportProvices(User user) {
        return null;
    }

    @Override
    public List<Subject> fetchUserShowSubjects(User user) {
        return null;
    }
}
