package com.xr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xr.dao.HolderPhotoMapper;
import com.xr.service.IHolderDataService;
import com.xr.service.IHolderPhotoService;
@Service
public class HolderPhotoServiceImpl implements IHolderPhotoService {
    @Autowired
    private HolderPhotoMapper hpm;
    
}
