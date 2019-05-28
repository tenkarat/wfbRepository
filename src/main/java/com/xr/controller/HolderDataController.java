package com.xr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xr.service.IHolderDataService;
@Controller
@RequestMapping("HolderData")
public class HolderDataController {
	@Autowired
	private IHolderDataService ihds;
	
	
	


}
