package com.irula.green.dao;

import com.irula.green.model.UserVO;

public interface UserVOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserVO record);

    int insertSelective(UserVO record);

    UserVO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserVO record);

    int updateByPrimaryKey(UserVO record);
}