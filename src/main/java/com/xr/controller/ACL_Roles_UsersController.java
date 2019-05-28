package com.xr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xr.service.IACL_Roles_UsersService;

@Controller
@RequestMapping("ACL_Roles_Users")
public class ACL_Roles_UsersController {
	@Autowired
	private IACL_Roles_UsersService iarus;
	public void  test(){
		System.out.println("测试git提交");
	}
	

}
