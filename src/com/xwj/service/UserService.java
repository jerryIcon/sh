package com.xwj.service;

import java.util.Objects;

import javax.servlet.http.HttpServletRequest;

import com.xwj.dao.UserDao;
import com.xwj.domain.User;

public class UserService {
	
	UserDao userDao =  new UserDao();
	
	/**
	 * 登入
	 * @param user
	 * @param request
	 * @return
	 */
	public User Login(User user,HttpServletRequest request) {
		User u =  userDao.selectUserByPasswrd(user);
		return u;
	}
	
	/**
	 *  注册
	 * @param user
	 * @param request
	 * @return
	 */
	public Boolean Register(User user,HttpServletRequest request) {
		Boolean u =  userDao.selectByUsername(user);
		if(u) {
			request.getSession().setAttribute("info", "账号已注册");
			// 已注册
			return false;
		}
		// 未注册
		userDao.insertUser(user);
		return true;
	}

}
