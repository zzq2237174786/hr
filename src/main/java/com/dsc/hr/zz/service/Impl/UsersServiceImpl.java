package com.dsc.hr.zz.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsc.hr.base.pojo.Users;
import com.dsc.hr.zz.mapper.UsersMapper;
import com.dsc.hr.zz.service.UsersService;
@Service
public class UsersServiceImpl implements UsersService{
	@Autowired
	private UsersMapper usersMapper = null;
	
	@Override
	public List<Users> selectAllUsers() {
		List<Users> allUsers = usersMapper.selectAll();
		return allUsers;
	}
}
