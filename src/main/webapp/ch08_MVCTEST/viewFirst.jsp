<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>고객 목록</h3>
	<hr>
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>이름</th>
			<th>전화번호</th>
		</tr>
		<c:forEach var="i" varStatus="e" items= "${reg}">
			<tr>
				<th>${e.count}</th>
				<th><a href="/jsp_study/rcon?action=info&id=${i.id}">${i.name}</a></th>
				<th>${i.phone}</th>
				<th>${i.grade}</th> 
			</tr>
		</c:forEach>
	</table>
	
	<a href="/jsp_study/rcon?action=list2">등급확인</a>
	<a href="/jsp_study/rcon?action=list">되돌아가기</a>
</body>
</html>