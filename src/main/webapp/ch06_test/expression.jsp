<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import= "java.util.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 	<% Calendar today = Calendar.getInstance();
 	%>

	Current Time : <%=today.get(Calendar.YEAR)%> <%=today.get(Calendar.MONTH) %>

</body>
</html>