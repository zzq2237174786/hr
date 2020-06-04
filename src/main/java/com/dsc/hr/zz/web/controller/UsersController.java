package com.dsc.hr.zz.web.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dsc.hr.base.pojo.Users;
import com.dsc.hr.zz.service.UsersService;

@RestController
public class UsersController {
	@Autowired
	private UsersService usersService = null;
	
	@RequestMapping("/selectAll")
	public  List<Users>  selectAll() { 
		List<Users> list = usersService.selectAllUsers();
		return list;
	}
}
