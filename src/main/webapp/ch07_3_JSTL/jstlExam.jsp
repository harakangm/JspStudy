<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>JSTL 종합예제</h2>
	<hr>
	<h3>set ,out</h3>

	<c:set var="product1" value="<b>애플 아이폰</b>" />
	<c:set var="product2" value="삼성 갤럭시 노트" />
	<c:set var="intarray" value="${[1,2,3,4,5]}" />


	<p>
		product1 :
		<c:out value="${product1}" default="Not resgisterd" escapeXml="true"></c:out>
	</p>


	<p>product2(el) : ${product1}</p>
	<p>intArray[2]: %{intArray[2]}</p>
	<hr>

	<h3>foreach 배열 출력</h3>


	<ul>
		<c:forEach var="num" varStatus="i" items="${intarray}">
			<li>${i.index} : ${num}</li>
		</c:forEach>
	</ul>

	<h3>jstl에서 if (else문을 못씀)</h3>

	<c:set var="checkout" value="true" />

	<c:if test="${checkout}">
		<p>제문 제품 : ${product2}</p>
	</c:if>


	<c:if test="${!checkout}">
		<p>제문 제품 아님</p>
	</c:if>


	<c:if test="${!empty product2}">
		<b>${product2} 이미 있음!</b>
	</c:if>

	<h3>choose, when, otherwise jstl에서 swich문</h3>
	<c:choose>
		<c:when test="${checkout}">
			<p>제문 제품 : ${product2}</p>
		</c:when>

		<c:when test="${!checkout}">
			<p>제문 제품 : ${product2}</p>
		</c:when>

		<c:otherwise>
			<p>주문 제품 아님</p>
		</c:otherwise>
	</c:choose>
	<hr>
	<h3>forTokenes 문자열을 특정단위로 잘라줌</h3>

	<c:forTokens var="city" items="Seoul|tokyo|New York|Toronto" delims="|"
		varStatus="i">

		<c:if test="${i.first}"> 도시목록 : </c:if>
				${city}

			<c:if test="${!i.last}">, </c:if>
	</c:forTokens>
</body>
</html>