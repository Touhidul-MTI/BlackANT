<!DOCTYPE html>
<html lang="">
	<head>
		<meta charset="utf-8">
			<meta name="viewport" content="width=device-width, initial-scale=1.0">
				<meta name="description" content="Muhammad Touhidul Islam">
					<title>BlackANT</title>

					<!-- css -->
					<link href="../css/bootstrap.min.css" rel="stylesheet">
						<link href="../css/animate.css" rel="stylesheet">
							<link rel="stylesheet" href="../css/font-awesome.min.css">
								<link rel="stylesheet" href="../css/style_default.css">
									<link rel="stylesheet" href="../css/style_single_navbar.css">

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
						<img src="/img/blackant_logo_brand.png">
					</a>
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li>
							<a href="#">Policy</a>
						</li>
					</ul><!-- end of navbar nav left -->

					<ul class="nav navbar-nav navbar-right">
						<li>
							<a href="/logout">
								<span class="glyphicon glyphicon-log-out" aria-hidden="true"></span>
								Logout
							</a>
						</li>
					</ul><!-- end of navbar right -->
				</div><!-- /.navbar-collapse -->
			</div><!-- /.container-fluid -->
		</nav><!-- end of navbar -->

		<div class="container">
			<div class="row">
				<div class="col-md-8 col-sm-8">
					<div class="col-md-8 col-sm-8 panel panel-default">
						<h3 class="text-primary">Admin profile</h3>
						<p class="text-primary">Name: ${admin.name}</p>
						<p class="text-primary">Email: ${admin.email}</p>
					</div>
				</div>
				<div class="col-md-4 col-sm-4">
					<a class="btn btn-default mywidth_full" href="">Manage Users</a>
					<a class="btn btn-default mywidth_full" href="/manageproducts">Manage
						Products</a>
					<a class="btn btn-default mywidth_full" href="#">Manage Orders</a>
				</div>
			</div>
		</div>
		

		<!-- javascript -->
		<script src="../js/jquery.min.js"></script>
		<script src="../js/bootstrap.min.js"></script>

	</body>
</html>