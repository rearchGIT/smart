package com.smart.mvc.mybatis.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.mvc.model.Pagination;
import com.smart.mvc.service.mybatis.impl.ServiceImpl;
import com.smart.mvc.mybatis.demo.dao.UserDao;
import com.smart.mvc.mybatis.demo.model.User;
import com.smart.mvc.mybatis.demo.service.UserService;

@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserDao, User, Integer> implements UserService {

	@Autowired
	public void setDao(UserDao dao) {
		this.dao = dao;
	}
	
	@Override
	public Pagination<User> findPaginationByAccount(String account, Pagination<User> p) {
		dao.findByAccount(account, p);
		return p;
	}
}
