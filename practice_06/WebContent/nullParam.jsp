<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
id 파라미터 : <%= request.getParameter("id") %><br />
name 파라미터 : <%= request.getParameter("name") %><br />
member 파라미터 : <%= request.getParameter("member") %><br />
</body>
</html>