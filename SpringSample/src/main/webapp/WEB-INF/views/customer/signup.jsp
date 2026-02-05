<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원가입</h2>
    <hr>
    <form action="/customer/signup" method="post">
        <div class="form-group">
            <label>아이디:</label>
            <input type="text" name="id" required>
        </div>
        <div class="form-group">
            <label>비밀번호:</label>
            <input type="password" name="password" required>
        </div>
        <div class="form-group">
            <label>이름:</label>
            <input type="text" name="name" required>
        </div>
        
        <button type="submit">가입하기</button>
        <button type="button" onclick="location.href='/main'">취소</button>
    </form>
</body>
</html>