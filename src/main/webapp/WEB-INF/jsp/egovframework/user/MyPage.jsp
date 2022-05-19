<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지</title>
<style>
body {
	text-align: center;
}
</style>
</head>
<body>
	<h2>마이페이지</h2>
	<form name="form">
		아이디:
		<input type="text" value="${userId.get('userid')}" name="userid" readonly>
		<br /> 패스워드:
		<input type="text" value="${userId.get('userpassword')}" name="userpassword">
		<br /> 가입일자:
		<input type="date" value="${userId.get('userregdate')}" name="userregdate">
		<br /> 포인트:
		<input type="number" value="${userId.get('userpoint')}" name="userpoint">
		<br />
		<input type="submit" value="수정" onclick="javascript: form.action='/user/main/updateInfo.do'">
		<input type="submit" value="삭제" onclick="javascript: form.action='/user/main/deleteInfo.do'">
		<br />
		<input type="submit" value="로그아웃" onclick="javascript: form.action='/user/main/logout.do'">
	</form>
</body>
</html>