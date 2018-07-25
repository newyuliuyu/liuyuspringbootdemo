package com.liuyu.user.service;

import com.liuyu.user.domain.*;

import java.util.List;

/**
 * ClassName: UserDataPermissionService <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-25 上午11:11 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
public interface UserPermissionDataService {

    Organization fetchUserOwnOrganization(User user);

    List<Clazz> fetchUserTeachClazzs(User user);

    List<School> fetchUserShowSchoolReportSchools(User user);

    List<City> fetchUserShowCityReportCitys(User user);

    List<County> fetchUserShowCountyReportCountys(User user);

    List<Province> fetchUserShowProvinceReportProvices(User user);

    List<Subject> fetchUserShowSubjects(User user);

}
