<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<!-- ���� ���� 
	session.setAttribute("a",4);�� ����
	int i = 4;�� ���� ����.
-->
<c:set var="a" value="4" />
	<c:if test="${4>3}">
		�ȳ��ϼ���
	</c:if>
	<c:if test="${a>3}">
		�ݰ�����
	</c:if>
	
	<!-- �ݺ��� step�� �Ⱦ��� �ڵ����� 1�� ����. ���� �Ƚᵵ ��-->
	<c:forEach begin="1" end="10">
		���ɽð��Դϴ�.21<br>
	</c:forEach>
	
	<c:set var="sum" value="0" />
	
	<c:forEach var="i" begin="1" end="10">
		<c:set var="sum" value="${sum=sum+i }" />
	</c:forEach>
	sum : ${sum }
</body>
</html>