package com.xr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xr.service.IHolderPhotoService;

@Controller
@RequestMapping("HolderPhoto")
public class HolderPhotoController {
	@Autowired
	private IHolderPhotoService ihps;

}
