package com.xr.dao;

import org.springframework.stereotype.Repository;

import com.xr.entity.MS_MeetRoomData;
@Repository
public interface MS_MeetRoomDataMapper {
    int deleteByPrimaryKey(Integer roomno);

    int insert(MS_MeetRoomData record);

    int insertSelective(MS_MeetRoomData record);

    MS_MeetRoomData selectByPrimaryKey(Integer roomno);

    int updateByPrimaryKeySelective(MS_MeetRoomData record);

    int updateByPrimaryKey(MS_MeetRoomData record);
}