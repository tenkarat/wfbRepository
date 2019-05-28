package com.xr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xr.dao.MS_MeetingDataMapper;
import com.xr.service.IMS_MeetingDataService;
@Service
public class MS_MeetingDataServiceImpl implements IMS_MeetingDataService {
	@Autowired
	private MS_MeetingDataMapper mdm;
	

}
