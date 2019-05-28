package com.xr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xr.service.IMS_MeetRoomDataService;

@Controller
@RequestMapping("MS_MeetRoomData")
public class MS_MeetRoomDataController {
	@Autowired
	private IMS_MeetRoomDataService imrds;

}
