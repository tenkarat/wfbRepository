package com.xr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xr.service.IMS_NoticeInformDataService;

@Controller
@RequestMapping("MS_NoticeInformData")
public class MS_NoticeInformDataController {
	@Autowired
	private IMS_NoticeInformDataService inids;

}
