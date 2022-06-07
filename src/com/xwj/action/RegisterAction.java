package com.xwj.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.xwj.domain.User;
import com.xwj.service.UserService;

public class RegisterAction extends ActionSupport implements ModelDriven<User>{

	User user = new User();
	
	UserService userService = new UserService();
	
	@Override
	public User getModel() {
		return user;
	}
	
	public String execute() {
		HttpServletRequest request = ServletActionContext.getRequest();
		if(userService.Register(user, request)) {
			request.setAttribute("info", "注册成功，请登入！");
			return SUCCESS;
		}
		return ERROR;
	}

}
