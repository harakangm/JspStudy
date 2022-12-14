<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="check" class="ch07.com.dao.Member" />
	<jsp:setProperty property="*" name="check"/>
	
	<%=check.result()%>
</body>
</html>