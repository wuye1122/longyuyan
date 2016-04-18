<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'success.jsp' starting page</title>
    
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
       
      
       <center> 欢迎来到查询页面 <br><br>
       <br>
       <br>
        <table border="1">
 
          
        <tr>
        <td>学号</td>
        <td>姓名</td>
        <td>地址</td>
        <td>邮箱</td>
         <td>删除</td>
        <td>更新</td>
        </tr>
        <c:forEach items="${requestScope.list}" var="sing">
        <tr>
        
         <td>${sing.id}</td>
        <td>${sing.name}</td>
        <td>${sing.address}</td>
        <td>${sing.email}</td>
         <td><a href="sing!del?id=${sing.id}">删除</a></td>
         <td><a href="sing!update1?id=${sing.id}">更新</a></td>
        
        </tr>
        
        
        
        
        </c:forEach>
        </table>
       <br>
       <br>
       <br>
       <br>
       <a href="sing!add1">添加数据</a>
        
       </center>  
        
  </body>
</html>
