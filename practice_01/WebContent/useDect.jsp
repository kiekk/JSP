<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%!
	public int multiply(int a, int b){
		int c = a * b;
		return c;
	}
%>
<title>Insert title here</title>
</head>
<body>
20 * 30 = <%= multiply(20, 30) %>
</body>
</html>