<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<!-- 
	출력하기

		*
	   ***
	  *****
	 *******
	*********
 	-->
 	<c:forEach var="i" begin="0" end="4">
 		<c:forEach var="j" begin="${i+1 }" end="4">
 		
 		&nbsp;
 		
 		</c:forEach>
 		<c:forEach var="j" begin="1" end="${1+(i*2) }">
 		*
 		
 		</c:forEach>
 		<br>
 	</c:forEach>
 	
 	
</body>
</html>