<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<!-- 변수 선언 
	session.setAttribute("a",4);와 같음
	int i = 4;랑 같지 않음.
-->
<c:set var="a" value="4" />
	<c:if test="${4>3}">
		안녕하세요
	</c:if>
	<c:if test="${a>3}">
		반가워요
	</c:if>
	
	<!-- 반복문 step을 안쓰면 자동으로 1씩 증가. 변수 안써도 됨-->
	<c:forEach begin="1" end="10">
		점심시간입니다.21<br>
	</c:forEach>
	
	<c:set var="sum" value="0" />
	
	<c:forEach var="i" begin="1" end="10">
		<c:set var="sum" value="${sum=sum+i }" />
	</c:forEach>
	sum : ${sum }
</body>
</html>