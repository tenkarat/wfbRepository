package com.xr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xr.service.IMS_MeetingDataService;

@Controller
@RequestMapping("MS_MeetingData")
public class MS_MeetingDataController {
	@Autowired
	private IMS_MeetingDataService imds;
	

}
