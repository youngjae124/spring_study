<%-- <%@ page language="java" contentType="text/html; charset=UTF-8" --%>
<%-- 	pageEncoding="UTF-8"%> --%>
<!-- <!DOCTYPE html> -->
<!-- <html> -->
<!-- <head> -->
<!-- <meta charset="UTF-8"> -->
<!-- <title>Insert title here</title> -->
<!-- </head> -->
<!-- <body> -->
<!-- 	<h1>로그인 접속 정보</h1> -->

<!-- 	<p> -->
<%-- 		현재 접속자: ${loginId} --%>
<!-- 	</p> -->
<!-- 	<p> -->
<%-- 		로그인 후 페이지 접속 횟수: ${count}번 --%>
<!-- 	</p> -->

<%-- 	<c:if test="${id != '사용자아이디 '}"> --%>
<!-- 		<a href="/quiz12/logout"> 로그아웃</a> -->
<!-- 	</c:if> -->

<!-- </body> -->
<!-- </html> -->


<!-- 선생님 풀이 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>quiz12 count 페이지</h1>
	
<!-- 	누가 로그인했는가 아이디 -->
<!-- 	몇번 로그인했는가 횟수 -->
	
	<c:choose>
<%-- 		<c:when test="${loginId == '' || loginId == null}"> --%>
<%--		null, "", length0  --%>
		<c:when test="${ empty loginId }">
			<p>익명의 사용자 접속중</p>
			<p>로그인 해주세요</p>
		</c:when>
		<c:otherwise>
			<p>로그인한 아이디 ${loginId} 님 환영합니다.</p>
		</c:otherwise>
	</c:choose>
	
	
	<p>접속횟수 : ${count} </p>
	
	
	<br><br><br>
	<a href="/quiz12/logout">로그아웃</a>
</body>
</html>