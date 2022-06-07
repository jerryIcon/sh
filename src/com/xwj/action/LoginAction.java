package com.xwj.action;

import java.util.Objects;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.xwj.domain.User;
import com.xwj.service.UserService;

public class LoginAction extends ActionSupport implements ModelDriven<User>{

	private User user = new User();
	
	private UserService userService = new UserService();
	
	@Override
	public User getModel() {
		return user;
	}

	public String execute() {
		HttpServletRequest request =   ServletActionContext.getRequest();
		if(user == null || user.getUsername().isEmpty() || user.getPassword().isEmpty()) {
			request.setAttribute("info", "账号或密码不能为空");
			return ERROR;
		}
		User u = userService.Login(user, request);
		if(Objects.isNull(u)) {
			request.setAttribute("info", "账号或密码错误");
			return ERROR;
		}
		request.setAttribute("info", "登入成功");
		request.getSession().setAttribute("user", u);
		System.out.println(u.toString());
		return SUCCESS;
		
	}
	
	

}
