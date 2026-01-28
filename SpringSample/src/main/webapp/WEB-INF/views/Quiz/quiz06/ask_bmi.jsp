<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>신체질량지수 측정</h1>
	<form action="/quiz06/result-bmi" method="post">
	이름:<input type = "text" name ="name" required><br>
	키:<input type = "number" name = "height" step="0.1" required><br>
	몸무게:<input type = "number" name = "weight" step = "0.1" required><br>
	<button type = "submit">확인하기</button>
</body>
</html>