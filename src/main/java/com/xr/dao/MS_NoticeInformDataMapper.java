package com.xr.dao;

import org.springframework.stereotype.Repository;

import com.xr.entity.MS_NoticeInformData;
@Repository
public interface MS_NoticeInformDataMapper {
    int deleteByPrimaryKey(Integer noticeno);

    int insert(MS_NoticeInformData record);

    int insertSelective(MS_NoticeInformData record);

    MS_NoticeInformData selectByPrimaryKey(Integer noticeno);

    int updateByPrimaryKeySelective(MS_NoticeInformData record);

    int updateByPrimaryKey(MS_NoticeInformData record);
}