package com.xr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xr.dao.ACL_Roles_UsersMapper;
import com.xr.service.IACL_Roles_UsersService;
@Service
public class ACL_Roles_UsersServiceImpl implements IACL_Roles_UsersService {

	@Autowired
	private ACL_Roles_UsersMapper arum;
	
}
