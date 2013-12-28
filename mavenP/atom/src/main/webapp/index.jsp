<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>success</title>
</head>
<body>

<p><font color="#6666CC">请登陆</font></p>
<hr>
<form name="form1" method="post" action="<%=response.encodeURL("login")%>"><!--login是LoginSevlet通过在web.xml映射了-->
  <table width="68%" border="0" cellpadding="2" cellspacing="2">
    <tr>
      <td width="33%" align="right">用户名：</td>
      <td width="67%">
  <input type="text" name="userName" ></td><!--注意这里用了自定义标签，如果有值就显示-->
    </tr>
    <tr>
      <td align="right">密码：</td>
      <td><input type="text" name="userPwd" ></td>
    </tr>
    <tr align="center">
      <td colspan="2">
        <input type="submit" name="Submit" value="登陆">
      </td>
    </tr>
  </table>
</form>
</body>
</html>
