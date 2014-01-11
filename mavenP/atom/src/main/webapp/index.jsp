<%@ page language="java" contentType="text/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs
/jquery/1.8.0/jquery.min.js"></script>
<script type="text/javascript" src="js/user.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>success</title>

<style> 
#css1
{
width:100px;
height:100px;
background:yellow;
transition:width 2s;
-moz-transition:width 2s; /* Firefox 4 */
-webkit-transition:width 2s; /* Safari and Chrome */
-o-transition:width 2s; /* Opera */
}

#css1:hover
{
width:300px;
}
</style>
</head>
<body>

<p><font color="#6666CC">login</font></p>
<hr>
<form name="form1" method="post" action="<%=response.encodeURL("login")%>"><!--login是LoginSevlet通过在web.xml映射了-->
  <table width="68%" border="0" cellpadding="2" cellspacing="2">
    <tr>
      <td width="33%" align="right">user name:
      <td width="67%">
  <input type="text" name="userName" ></td><!--注意这里用了自定义标签，如果有值就显示-->
    </tr>
    <tr>
      <td align="right">password:</td>
      <td><input type="text" name="userPwd" ></td>
    </tr>
    <tr align="center">
      <td colspan="2">
        <input type="submit" name="Submit" value="submit">
      </td>
    </tr>
  </table>
</form>

<button id="b2" type="button">toggle</button>
<button id="b1" type="button">hidden</button>
<button id="b3" type="button">fadeToggle</button>
<button id="b4" type="button">slideToggle</button>
<button id="b5" type="button">animate1</button>
<button id="b6" type="button">animate2</button>
<button id="b7" type="button">animate3</button>

<p>pra1</p>
<p>pra2</p>
<div id="div2" style="background:blue;height:100px;width:100px;position:absolute;">3</div>
<div id="div1" style="background:#98bf21;height:100px;width:100px;position:relative;">1or2</div>

<div id="css1">css3</div>
</body>
</html>
