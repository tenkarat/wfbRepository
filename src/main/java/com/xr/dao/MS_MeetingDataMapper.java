package com.xr.dao;

import org.springframework.stereotype.Repository;

import com.xr.entity.MS_MeetingData;
@Repository
public interface MS_MeetingDataMapper {
    int deleteByPrimaryKey(Integer meetno);

    int insert(MS_MeetingData record);

    int insertSelective(MS_MeetingData record);

    MS_MeetingData selectByPrimaryKey(Integer meetno);

    int updateByPrimaryKeySelective(MS_MeetingData record);

    int updateByPrimaryKey(MS_MeetingData record);
}