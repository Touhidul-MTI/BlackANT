<!DOCTYPE html>
<html lang="">
	<head>
		<meta charset="utf-8">
			<meta name="viewport" content="width=device-width, initial-scale=1.0">
				<meta name="description" content="Muhammad Touhidul Islam">
					<title>Muhammad Touhidul Islam</title>

					<!-- css -->
					<link href="css/bootstrap.min.css" rel="stylesheet">
						<link href="css/animate.css" rel="stylesheet">
							<link rel="stylesheet" href="css/font-awesome.min.css">
								<link rel="stylesheet" href="css/style.css">
	</head>
	<body class="custom-body">

		<!--navigation starts -->
		<nav class="navbar navbar-default">
			<div class="container-fluid">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
						aria-expanded="false">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#">
						<img src="/img/blackant_logo2.png">
					</a>
					<!-- <a class="navbar-brand" href="#">BlackANT</a> -->
					<!-- <a class="navbar-brand" href="#"><img alt="Brand" src="images/logo.png" 
						class="img-responsive" /></a> -->
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li class="active">
							<a href="#">
								Home
							</a>
						</li>
						<li>
							<a href="#">Policy</a>
						</li>
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown"
								role="button" aria-haspopup="true" aria-expanded="false">
								Categories
								<span class="caret"></span>
							</a>
							<ul class="dropdown-menu">
								<li>
									<a href="#">Action</a>
								</li>
								<li>
									<a href="#">Another action</a>
								</li>
								<li>
									<a href="#">Something else here</a>
								</li>
								<li role="separator" class="divider"></li>
								<li>
									<a href="#">Separated link</a>
								</li>
								<li role="separator" class="divider"></li>
								<li>
									<a href="#">One more separated link</a>
								</li>
							</ul>
						</li>
					</ul><!-- end of navbar nav left -->

					<form class="navbar-form navbar-left">
						<div class="form-group">
							<input type="text" class="form-control" placeholder="Search">
						</div>
						<button type="submit" class="btn btn-default">
							<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
						</button>
					</form>
					<ul class="nav navbar-nav navbar-right">
						<li>
							<a href="/register">
								<span class="glyphicon glyphicon-user" aria-hidden="true"></span>
								Register
							</a>
						</li>
						<li>
							<a href="/login">
								<span class="glyphicon glyphicon-log-in" aria-hidden="true"></span>
								Login
							</a>
						</li>
						<li>
							<a href="#">
								<span class="glyphicon glyphicon-shopping-cart"
									aria-hidden="true"></span>
								Cart
							</a>
						</li>
					</ul><!-- end of navbar right -->
				</div><!-- /.navbar-collapse -->
			</div><!-- /.container-fluid -->
		</nav><!-- end of navbar -->

		<div class="container">
			<div class="jumbotron">
				<h2>${title}</h2>
				<p>${message}</p>
				<#include "a.ftl"/>
			</div>
		</div>

		<!-- javascript -->
		<script src="js/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>

	</body>
</html>