package com.xr.dao;

import org.springframework.stereotype.Repository;

import com.xr.entity.HolderData;
@Repository
public interface HolderDataMapper {
    int deleteByPrimaryKey(String holderno);

    int insert(HolderData record);

    int insertSelective(HolderData record);

    HolderData selectByPrimaryKey(String holderno);

    int updateByPrimaryKeySelective(HolderData record);

    int updateByPrimaryKeyWithBLOBs(HolderData record);

    int updateByPrimaryKey(HolderData record);
}