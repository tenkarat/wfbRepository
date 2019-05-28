package com.xr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xr.dao.ACL_RolesMapper;
import com.xr.service.IACL_RolesService;
@Service
public class ACL_RolesServiceImpl implements IACL_RolesService {
	@Autowired
	private ACL_RolesMapper arm;
	

}
