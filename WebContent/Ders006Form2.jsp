<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">
<head>
<title>Title</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
</head>
<body>

<%
String email,password,validationNullControl;
validationNullControl=request.getParameter ( "login_submit" );

email=request.getParameter ( "login_email_address" );
password=request.getParameter ( "login_password" );
%>

<%
if(validationNullControl!=null){
	out.println ("e-mailiniz: "+email +" şifreniz: "+password );
	out.println (email.trim (  ).length (  )  );
}



%>


</body>
</html>