<%@page import="com.rudra.beans.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="user" class="com.rudra.beans.User" scope="session"></jsp:useBean>
First Name: <jsp:getProperty property="firstname" name="user"/><br/>
Last Name: <jsp:getProperty property="lastname" name="user"/>
</body>
</html>