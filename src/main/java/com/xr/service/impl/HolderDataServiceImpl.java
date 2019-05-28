package com.xr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xr.dao.HolderDataMapper;
import com.xr.service.IHolderDataService;

@Service
public class HolderDataServiceImpl implements IHolderDataService {
	@Autowired
	private HolderDataMapper hdm;
	

}
