package com.xr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xr.dao.MS_MeetAttendDataMapper;
import com.xr.service.IMS_MeetAttendDataService;
@Service
public class MS_MeetAttendDataServiceImpl implements IMS_MeetAttendDataService {
	@Autowired
	private MS_MeetAttendDataMapper madm;
	

}
