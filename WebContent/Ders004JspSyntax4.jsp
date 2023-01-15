<%@page import="tr.com.huseyinaydin.scholl.Student"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<%
Student student4=new Student();
student4.setName ( "Yeni Isim" );
%>
<%=student4 %>

</body>
</html>