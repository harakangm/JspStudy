<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- jsp:include액션태그 : param도 넘겨줄수 있다 --%>
	<jsp:include page="headerjsp.jsp">
	<jsp:param value="My home" name="title"/>
	</jsp:include>
</body>
</html>