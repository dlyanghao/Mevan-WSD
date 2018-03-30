package com.yanghao.serviceimpl;

import com.yanghao.bean.User;
import com.yanghao.dao.UserDao;
import com.yanghao.service.UserService;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public boolean saveUser(User user) {
		return userDao.save(user);
	}

}
