<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<center>
		<h2>회원 가입 양식</h2>
		<form action="Mpro2" method="post">
			<table width="400">
				<tr height="40">
					<td width="150">아이디</td>
					<td><input type="text" name="id"></td>
				</tr>
				<tr height="40">
					<td width="150">패스워드</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr height="40">
					<td width="150">이메일</td>
					<td><input type="email" name="email"></td>
				</tr>
				<tr height="40">
					<td width="150">전화</td>
					<td><input type="tel" name="tel"></td>
				</tr>
				<tr height="40">
					<td width="150">주소</td>
					<td><input type="text" name="address"></td>
				</tr>
				<tr height="40">
					<td colspan="2" align="center"><input type="submit" value="전송"></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>