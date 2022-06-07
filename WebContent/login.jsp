<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<form action="login.action">
		<div>
			<label>账号：</label>
			<input type="text" name="username">
		</div>
		<div>
			<label>密码：</label>
			<input type="password" name="password">
		</div>
		<div>
			<s:property value="#request.info"/>
		</div>
		<input type="submit" value="登入">
		<a href="register.jsp">注册</a>
	</form>
</body>
</html>