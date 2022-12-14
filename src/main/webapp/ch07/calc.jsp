<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%-- jsp:useBean : 객체 생성 --%>
    <%--  id : 변수명이랑 비슷하게 사용 객체를 이러한 이름으로 쓰겠다 --%>
    <%-- class: 인스턴스화 시킬 class를 적는데 패키지명과 클래스명둘 다적음 --%>
    <jsp:useBean id="calc" class="ch07.Calculator"/>
    
    <%--name : 객체명  property : * 모든 필드 값에-%>
    <%--cal.setN1(requst.getParmater("n1")); --%>
    <jsp:setProperty name="calc" property ="*" />
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	실행결과 : <%=calc.calc() %>
</body>
</html>