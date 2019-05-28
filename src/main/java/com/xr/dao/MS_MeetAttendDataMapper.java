package com.xr.dao;

import org.springframework.stereotype.Repository;

import com.xr.entity.MS_MeetAttendData;
@Repository
public interface MS_MeetAttendDataMapper {
    int deleteByPrimaryKey(Integer datano);

    int insert(MS_MeetAttendData record);

    int insertSelective(MS_MeetAttendData record);

    MS_MeetAttendData selectByPrimaryKey(Integer datano);

    int updateByPrimaryKeySelective(MS_MeetAttendData record);

    int updateByPrimaryKey(MS_MeetAttendData record);
}