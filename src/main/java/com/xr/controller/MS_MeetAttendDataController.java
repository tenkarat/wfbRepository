package com.xr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xr.service.IMS_MeetAttendDataService;

@Controller
@RequestMapping("MS_MeetAttendData")
public class MS_MeetAttendDataController {
	@Autowired
	private IMS_MeetAttendDataService imads;
	
	

}
