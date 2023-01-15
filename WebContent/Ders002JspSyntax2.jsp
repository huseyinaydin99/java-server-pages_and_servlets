<%@page import="java.util.*"%>
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
String name="Hüseyin";
out.println ("<b>"+name+"</b>" );
out.println ("");
out.println ("<i>"+name+"</i>" );
out.println ("<mark>"+name+"</mark>" );
out.println ("<code>"+name+"<code>"+"\n" );
%>

<b>yeni ad  <%=name %> </b>


</body>
</html>