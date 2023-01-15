<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!doctype html>
<html lang="tr">
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
<body>

<style>
#form-id{  
border:1px solid rgba(0,0,0,.2);
padding:5%;
box-shadow: 1px 1px 5px 1px black;
 }
</style>

<form class="container mt-5" id="form-id" method="post" action="Login">
<div class="form-group">
 <input type="text" placeholder="adınızı soyadınızı giriniz" name="nameSurname" id="nameSurname" required="required"  class="form-control"/>
</div>

<div class="form-group">
 <input type="email" placeholder="email adresinizi  giriniz" name="emailAddress" id="emailAddress" required="required"  class="form-control"/>
</div>

<div class="form-group">
 <input type="password" placeholder="şifrenizi giriniz" name="password" id="password" required="required"  class="form-control"/>
</div>

<div class="btn-group mr-2" role="group" aria-label="Basic Tutorials">
<input type="reset" value="Temizle" class="btn btn-danger mr-2" />
<input type="submit" value="Gönder" class="btn btn-primary" />
</div>


</form>


	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>