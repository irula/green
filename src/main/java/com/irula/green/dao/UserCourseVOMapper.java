package com.irula.green.dao;

import com.irula.green.model.UserCourseVO;

public interface UserCourseVOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserCourseVO record);

    int insertSelective(UserCourseVO record);

    UserCourseVO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserCourseVO record);

    int updateByPrimaryKey(UserCourseVO record);
}