<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 페이지</title>
<style>
	body {
		text-align: center;
	}
</style>
</head>
<body>
	<h2>회원가입</h2>
	<form action="/user/main/RegAction.do">
		<input type="text" name="userId" placeholder="아이디 입력">
		<br />
		<input type="password" name="userPassword" placeholder="비밀번호 입력">
		<br />
		<input type="submit" value="회원가입">
	</form>
</body>
</html>