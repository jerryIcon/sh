package com.xwj.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.xwj.domain.User;

public class UserDao {
	
	
	/**
	 *  获取登入账户
	 * @param user
	 * @return
	 */
	public User selectUserByPasswrd(User user) {
		Session session =  BaseDao.getSession();
		Transaction tr =  session.beginTransaction();
		Criteria ct =  session.createCriteria(User.class);
		ct.add(Restrictions.eq("username", user.getUsername()));
		ct.add(Restrictions.eq("password", user.getPassword()));
		List<User> userList =  ct.list();
		tr.commit();
		BaseDao.closeSession();
		if(userList.size() ==0) {
			return null;
		}
		return userList.get(0);
	}
	
	/**
	 *  校验账户是否注册
	 * @param user
	 * @return
	 */
	public Boolean selectByUsername(User user) {
		Session session =  BaseDao.getSession();
		Transaction tr =  session.beginTransaction();
		Criteria ct =  session.createCriteria(User.class);
		ct.add(Restrictions.eq("id", user.getUsername()));
		List<User> userList =  ct.list();
		tr.commit();
		BaseDao.closeSession();
		if(userList.size() ==0) {
			return false;
		}
		return true;
	}
	
	/**
	 *  添加用户
	 * @param user
	 * @return
	 */
	public Boolean insertUser(User user) {
		Session session =  BaseDao.getSession();
		Transaction tr =  session.beginTransaction();
		session.save(user);
		tr.commit();
		BaseDao.closeSession();
		return true;
	}
	
}
