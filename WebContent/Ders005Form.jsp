<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">
<head>
<title>Title</title>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body class="container">

	<form id="form_add" name="form_add" method="post"	action="Ders005Form.jsp">
		<div class="form-group mt-5">
			<label for="login_email_address" class="text-muted">Email
				adresiniz</label> <input type="email" name="login_email_address"
				id="login_email_address" required="required" title="email adresiniz"
				class="form-control " placeholder="email adresinizi giriniz" />
		</div>

		<div class="form-group mt-1">
			<label for="login_password" class="text-muted">Şifreniz
				adresiniz</label> <input type="password" name="login_password"
				id="login_password" required="required" title="şifreniz adresiniz"
				class="form-control" placeholder="Şifrenizi giriniz" />
		</div>

		<input type="reset" value="Temizle" class="btn btn-danger" /> 
<!-- 		<input type="submit" value="Gönder" class="btn btn-primary" 
			name="login_submit" /> -->
			<input type="submit" value="Gönder" class="btn btn-primary"
			name="login_submit" />
	</form>


<%
String email="",password="",validationNullControl="";
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



	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>