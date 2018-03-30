package com.yanghao.daoimpl;

import java.io.Serializable;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.yanghao.bean.User;
import com.yanghao.dao.UserDao;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao{
	
	

	@Override
	public boolean save(User user) {
		Serializable save = this.getHibernateTemplate().save(user);
		if(save!=null){
			return true;
		}
		return false;
	}
}
