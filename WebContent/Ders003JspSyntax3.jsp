<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hüseyin Aydın</title>
</head>
<body>

<%
	List<Integer> listem44=new ArrayList<>();
	for(int i=0; i<10; i++){
		listem44.add(i);
	}
	//
	out.println("<ul>"); 
	for(int temp:listem44){
		out.println("<li>");
		out.println(temp+" ");
		out.println("</li>");
	}
	out.println("</ul>");
%>


<ul>
<%
for(int temp:listem44){
%>

<li style="display: inline;">	<%out.print(temp+" "); %> </li>
<%} %>
</ul>

</body>
</html>