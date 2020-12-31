<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="elfunc" uri="/WEB-INF/tlds/el-function.tld" %>
<%
	request.setAttribute("price", 12345);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
가격은 <strong> ${elfunc:formatNumber(price, '#,##0')} </strong>원 입니다.
</body>
</html>