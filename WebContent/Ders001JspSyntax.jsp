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
//out.println(name);
int x,y,result=0;
x=5; y=9;
result=x+y;
%>

<%!
public String concatString(String kelime){
	return kelime;
}
%>

<%=name %>
<%=concatString ( "Merhabalar nasılsın" ) %>
<%=result %>

</body>
</html>