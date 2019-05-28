package com.xr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xr.dao.MS_NoticeInformDataMapper;
import com.xr.service.IMS_NoticeInformDataService;
@Service
public class MS_NoticeInformDataServiceImpl implements IMS_NoticeInformDataService {

	@Autowired
	private MS_NoticeInformDataMapper nidm;
	
	
}
