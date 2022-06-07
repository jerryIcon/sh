package com.xwj.utils;

import java.util.Objects;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.xwj.domain.User;

public class PrivilegeInterceptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		System.out.println("进入前置处理器");
		
		Object user =  arg0.getInvocationContext().getSession().get("user");
		System.out.println(user);
		if(user != null) {
			return arg0.invoke();
		}
		return "login";
	}

}
