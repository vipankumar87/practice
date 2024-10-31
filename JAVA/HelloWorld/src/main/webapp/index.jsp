<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Home</title>
</head>
<body>
<%-- this is jsp comment --%>
<%! int x = 22; %>
<%="Hello" + x %>

<%!
String showMessage(){
	return "Hi there";
}
%>
<%=showMessage() %>
<% int y = 10; %>
<%=y %>
</body>
</html>