<%@ page language="java" import="java.util.*"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>注册</h1>
	<form action="register">
		<div>
			<label>账号：</label>
			<input type="text" name="username">
		</div>
		<div>
			<label>密码：</label>
			<input type="password" name="password">
		</div>
		<div>
			<label>昵称：</label>
			<input type="text" name="nick">
		</div>
		<div>
			<label>学校</label>
			<input type="text" name="university">
		</div>
		
		<div>
			<label>地址</label>
			<input type="text" name="address">
		</div>
		<div>
			<s:property value="#request.info"/>
		</div>
		<input type="submit" value="注册">
	</form>
</body>
</html>