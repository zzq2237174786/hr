package com.dsc.hr.zz.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dsc.hr.base.pojo.Users;

public interface UsersService {
	public  List<Users> selectAllUsers();
}
