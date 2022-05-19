<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인페이지</title>
<style>
	body {
		text-align: center;
	}
</style>
</head>
<body>
	<h2>로그인</h2>
	<form action="/user/main/MainExAction.do" method="post">
		<input type="text" name="userId" placeholder="아이디 입력" />
		<br />
		<input type="password" name="userPassword" placeholder="비밀번호 입력" />
		<br />
		<input type="submit" value="로그인">
		<input type="button" value="회원가입" onclick="location.href='/user/main/RegPage.do' ">
	</form>
</body>
</html>