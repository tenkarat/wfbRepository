package com.xr.dao;

import org.springframework.stereotype.Repository;

import com.xr.entity.HolderPhoto;
import com.xr.entity.HolderPhotoWithBLOBs;
@Repository
public interface HolderPhotoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HolderPhotoWithBLOBs record);

    int insertSelective(HolderPhotoWithBLOBs record);

    HolderPhotoWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HolderPhotoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HolderPhotoWithBLOBs record);

    int updateByPrimaryKey(HolderPhoto record);
}