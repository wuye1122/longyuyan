<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'add.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
                   <center>
                   <h4>按照下面要求增加数据</h4>
                   
                   <form action="sing!add" method="post" id="for">
                   
                   <table>
                   
                   <tr>
        <td>学号</td>
        <td>姓名</td>
        <td>地址</td>
        <td>邮箱</td>
                   
         </tr>
         
                   <tr>
        <td><input type="text" name="sin.id"></td>
        <td><input type="text" name="sin.name"></td>
        <td><input type="text" name="sin.address"></td>
        <td><input type="text" name="sin.email"></td>
                   
         </tr>
         <tr>
         
         <td colspan="4"><input type="submit" value="点击增加"></td>
         
         </tr>
         
       
                   
                   </table>
                   
  
                   </form>
                   
                   
                   
                   
                   
                   </center> <br>
  </body>
</html>
