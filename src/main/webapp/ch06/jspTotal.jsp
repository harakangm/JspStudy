<%@page import="java.lang.reflect.Method"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%-- import 라이브러리를 가져옴 --%>
<%@ page import = "java.util.*" %>
<%@ page import = "java.lang.Math" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>jsp종합예제</h2>
	<hr />
	
	<!--선언태그(html용주석)-->
	<%--  선언테크:멤버 변수,메소드 선언  --%>
	<%!
	String[] members = {"김하서", "김길동", "김사랑", "박사랑"};
	int num1 = 10;
	
	int calc(int num2) {
		return num1 + num2;
	}
	%>
	
	<%-- 표현태그 :사칙연산 간단한 메서드의 값이나 print.out할수 있는값 --%>
	<h3>
		1.calc(10) 메소드 실행 결과 : <%=calc(10)%>
		<br />
		2.num1변수 출력 : <%=num1%>
		<br />
		3.연산 출력: <%=num1 + 1%>
	</h3>
	<hr />
	<%-- 스크립트릿 태그: 모든 자바코드 --%>
	<ul>
		<%for(String name : members) {%>
			<li><%=name%></li>
		<%} %>
	</ul>
	
	<ul>
		<%for(String name : members) {
			 out.println
			 	("<li>"+ name + "</li>");
		}
		%>
	</ul>
	
	<!-- 지시어  -->
	<%-- include: jsp파일을 합쳐줌 --%>
	<hr />
	<%@ include file = "../hello.jsp" %>
	<% Date day = new Date();%>
	<hr/>
	현재 날짜 : <%= day %>
	5의 제곱: <%= (int)Math.pow(5,2) %>
	<hr>
</body>
</html>