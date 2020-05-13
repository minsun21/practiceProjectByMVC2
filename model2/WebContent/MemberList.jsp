<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<center>
		<h2>회원 정보 보기</h2>
		<table width="800">
			<tr height="40">
				<td align="center" width="50">ID</td>
				<td align="center" width="200">EMAIL</td>
				<td align="center" width="150">TEL</td>
				<td align="center" width="150">HOBBY</td>
				<td align="center" width="150">JOB</td>
				<td align="center" width="100">AGE</td>
				<td align="center" width="150">INFO</td>
			</tr>
			<c:forEach var="bean" items="${memberList }">
				<tr height="40">
					<td align="center" width="50">${bean.id }</td>
					<td align="center" width="200"><a href="#">${bean.email }</a></td>
					<td align="center" width="150">${bean.tel }</td>
					<td align="center" width="150">${bean.hobby }</td>
					<td align="center" width="150">${bean.job }</td>
					<td align="center" width="100">${bean.age }</td>
					<td align="center" width="150">${bean.info }</td>
				</tr>
			</c:forEach>
		</table>
	</center>
</body>
</html>