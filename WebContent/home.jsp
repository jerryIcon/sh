<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		书籍管理系统--用户：<s:property value="#session.user.nick"/>
	</div>
	<s:iterator value="#session.BookList">
		<div>
			<label>id:</label>
			 <s:property value="id"/>
		</div>
		
		<div>
			<label>name:</label>
			 <s:property value="name"/>
		</div>
		
		<div>
			<label>desc:</label>
			 <s:property value="desc"/>
		</div>
		
		<div>
			<label>author:</label>
			 <s:property value="author"/>
		</div>
		
		<div>
			<label>price:</label>
			 <s:property value="price"/>
		</div>
		
		<div>
			<a href="/UpdateBook">修改</a>
			<a href="/DeleteBook">删除</a>
		</div>
	</s:iterator>
</body>
</html>