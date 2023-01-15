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
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<style>
#loginHeader {
	text-transform: uppercase;
}
</style>
</head>
<body class="container">

	<!-- emmet -->
	<!-- form>(div.form-group>span{email adresiniz}+input.form-control+div.text-muted{adınızı girmediniz})*2+ -->
	<form action="loginPage" method="post" class="mt-5"
		style="border: 1px solid rgba(0, 0, 0, .1); padding: 5% !important; box-shadow: 1px 1px 10px 1px #333;">
		<h1 class="text-muted text-center" id="loginHeader">Login Page</h1>
		<div class="form-group">
			<span for="yourEmail">email adresiniz</span> 
			<input type="email"
			value="<%=(String)request.getAttribute ( "emailValue" )!=null ?(String)request.getAttribute ( "emailValue" ) : ""  %>"
				class="form-control" name="yourEmail" id="yourEmail"
				placeholder="email adresiniz" >
				
				<%
				String emailSpan="";
				Boolean resultEmailSpan=(Boolean)  request.getAttribute ( "email" );
				if(resultEmailSpan!=null && resultEmailSpan==true){
					emailSpan=(String) request.getAttribute ( "emailKey" );
				%>			
						<div class="text-muted bg-danger mt-2" style="color:white!important; padding:1%;  opacity:.8"><%=emailSpan %></div>
				<% }
				%>

		</div>
		<div class="form-group">
			<span for="yourPassword">şifre adresiniz</span> <input
				type="password" class="form-control" name="yourPassword"
				value="<%=(String)request.getAttribute ( "passwordSpan" )!=null ?(String)request.getAttribute ( "passwordValue" ) : ""  %>"
				id="yourPassword" placeholder="şifreniz">
				
					<%
					String passwordSpan="";
					Boolean resultPasswordSpan=(Boolean)  request.getAttribute ( "password" );
					if(resultPasswordSpan!=null &&resultPasswordSpan==true  ){
						passwordSpan=(String) request.getAttribute ( "passwordKey" );
					%>			
							<div class="text-muted bg-danger mt-2" style="color:white!important; padding:1%; opacity:.8;"><%=passwordSpan %></div>
					<% }
					%>
				

		</div>
		<div class="btn-group">
			<button type="reset" class="btn btn-danger mr-5">Temizle</button>
			<button type="submit" class="btn btn-primary">Gönder</button>
		</div>
	</form>
	
	<%
	String email="";
	Boolean resultEmail=(Boolean)  request.getAttribute ( "email" );
	if(resultEmail!=null && resultEmail==true){
		email=(String) request.getAttribute ( "emailKey" );
	%>			
			<div class="alert alert-primary mt-3" role="alert">Email girmediniz</div>
	<% }
	%>
	
	
	<%
	String password="";
	Boolean resultPassword=(Boolean)  request.getAttribute ( "password" );
	if(resultPassword!=null && resultPassword==true ){
		password=(String) request.getAttribute ( "passwordKey" );
	%>			
			<div class="alert alert-danger mt-3" role="alert">Şifre girmediniz</div>
	<% }
	%>
	


	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
</body>
</html>