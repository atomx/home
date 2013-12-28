<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<font color="#993366">请输入用户名和密码，或者创建一个新用户！</font>
<%@ include file="/index.jsp" %>
<hr>
<a href="<%=response.encodeURL("newAccount.jsp")%>">创建一个新用户 </a>
</body>
</html>