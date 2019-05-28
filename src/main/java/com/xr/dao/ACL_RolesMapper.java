package com.xr.dao;

import org.springframework.stereotype.Repository;

import com.xr.entity.ACL_Roles;
@Repository
public interface ACL_RolesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ACL_Roles record);

    int insertSelective(ACL_Roles record);

    ACL_Roles selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ACL_Roles record);

    int updateByPrimaryKey(ACL_Roles record);
}