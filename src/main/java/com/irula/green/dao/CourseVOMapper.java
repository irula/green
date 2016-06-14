package com.irula.green.dao;

import com.irula.green.model.CourseVO;

public interface CourseVOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CourseVO record);

    int insertSelective(CourseVO record);

    CourseVO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CourseVO record);

    int updateByPrimaryKey(CourseVO record);
}