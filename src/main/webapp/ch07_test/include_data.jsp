<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	
	<%
	int num = Integer.parseInt(request.getParameter("calc"));
		for(int i = 1; i <10; i++){%>
			<%out.println("5 * " + i + "=");
			out.println(num*i + "<br>");%>
			<br>
		<%}

	%>	
    

	

	
</body>
</html>