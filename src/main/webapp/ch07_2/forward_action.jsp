<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- forward사용 : 페이지를 이동시키는데 사용 --%>
<%-- 이것도 파람을 이용해서 값을 전달 가능 --%>
	<% request.setCharacterEncoding("UTF-8"); %>

	<jsp:forward page="page_control_end.jsp">
		<jsp:param value="000-3333-3333" name="tel"/>
	</jsp:forward>
</body>
</html>