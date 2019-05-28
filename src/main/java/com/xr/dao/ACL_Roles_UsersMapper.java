package com.xr.dao;

import org.springframework.stereotype.Repository;

import com.xr.entity.ACL_Roles_Users;
@Repository
public interface ACL_Roles_UsersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ACL_Roles_Users record);

    int insertSelective(ACL_Roles_Users record);

    ACL_Roles_Users selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ACL_Roles_Users record);

    int updateByPrimaryKey(ACL_Roles_Users record);
}