<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="calc" class="ch07.com.dao.GuGuDan" />
	<jsp:setProperty property="num" name="calc" value="5"/>
	<h4>구구단 출력하기</h4>
	<%= calc.calc() %>
	
</body>
</html>