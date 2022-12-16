<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>고객정보</h2>
	<hr>
	<ol>
		<li>고객아이디 : ${p.id}</li>
		<li>고객 이름 : ${p.name}</li>
		<li>고객 주소 : ${p.address}</li>
		<li>고객 등급 : ${p.grade}</li>
		<li>고객 전화번호 : ${p.phone}</li>
	</ol>
</body>
</html>