package com.xr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xr.service.IACL_RolesService;

@Controller
@RequestMapping("ACL_Roles")
public class ACL_RolesController {
	@Autowired
	private IACL_RolesService iars;

}
