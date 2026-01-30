<%-- <%@ page language="java" contentType="text/html; charset=UTF-8" --%>
<%--     pageEncoding="UTF-8"%> --%>
<!-- <!DOCTYPE html> -->
<!-- <html> -->
<!-- <head> -->
<!-- <meta charset="UTF-8"> -->
<!-- <title>Insert title here</title> -->
<!-- </head> -->
<!-- <body> -->
<!-- <h2> 로그인</h2> -->
<!--     <form action="/quiz12/login" method="post"> -->
<!--         아이디: <input type="text" name="id"><br> -->
<!--         비밀번호: <input type="password" name="pw"><br> -->
<!--         <button type="submit">로그인</button> -->
        
<!-- </body> -->
<!-- </html> -->




<!-- 선생님 풀이 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>quiz12 login page</h1>
	
	<form action="/quiz12/login" method="post">
		id : <input type="text" name="id"> <br>
		pw : <input type="password" name="pw"> <br>
		<button type="submit">로그인</button>
	</form>
</body>
</html>