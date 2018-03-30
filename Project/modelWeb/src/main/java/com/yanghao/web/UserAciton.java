package com.yanghao.web;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.yanghao.bean.User;
import com.yanghao.service.UserService;

public class UserAciton extends ActionSupport implements ModelDriven<User>{
	
	private User user;
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public String saveUser(){
		System.out.println("成功进入");
		boolean saveUser = userService.saveUser(user);
		if(saveUser)
		{
			return "success";
		}
		return NONE;
	}

	@Override
	public User getModel() {
		if(user == null)
		{
			user = new User();
		}
		// TODO Auto-generated method stub
		return user;
	}

}
