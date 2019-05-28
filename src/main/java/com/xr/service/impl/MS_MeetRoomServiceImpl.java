package com.xr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xr.dao.MS_MeetRoomDataMapper;
import com.xr.service.IMS_MeetRoomDataService;
@Service
public class MS_MeetRoomServiceImpl implements IMS_MeetRoomDataService {
	@Autowired
	private MS_MeetRoomDataMapper mdm;
	

}
