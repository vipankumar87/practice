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
First Name: <jsp:setProperty property="firstname" name="user" value="Karan"/><br/>
Last Name: <jsp:setProperty property="lastname" name="user" value="ALFafaf"/>
</body>
</html>