<!DOCTYPE html>
<html lang="">
	<head>
		<meta charset="utf-8">
			<meta name="viewport" content="width=device-width, initial-scale=1.0">
				<meta name="description" content="Muhammad Touhidul Islam">
					<title>BlackANT</title>

					<!-- css -->
					<link href="css/bootstrap.min.css" rel="stylesheet">
						<link href="css/animate.css" rel="stylesheet">
							<link rel="stylesheet" href="css/font-awesome.min.css">
								<link rel="stylesheet" href="css/styletest.css">
									<link rel="stylesheet" href="css/style_form.css">
										<link rel="stylesheet" href="css/catstyle2.css">

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
						<button type="submit" class="btn btn-default bt">
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


		<div class="container-fluid">

			<div class="row">
				<div class="col-md-2">

					<div class="nav-side-menu">
						<div class="brand">Categories</div>
						<i class="fa fa-bars fa-2x toggle-btn" data-toggle="collapse"
							data-target="#menu-content"></i>

						<div class="menu-list">

							<ul id="menu-content" class="menu-content collapse out">
								<li>
									<a href="#">
										<i class="fa fa-dashboard fa-lg"></i>
										Dashboard
									</a>
								</li>

								<li data-toggle="collapse" data-target="#products" class="collapsed active">
									<a href="#">
										<i class="fa fa-gift fa-lg"></i>
										UI Elements
										<span class="arrow"></span>
									</a>
								</li>
								<ul class="sub-menu collapse" id="products">
									<li class="active">
										<a href="#">CSS3 Animation</a>
									</li>
									<li>
										<a href="#">General</a>
									</li>
									<li>
										<a href="#">Buttons</a>
									</li>
									<li>
										<a href="#">Tabs & Accordions</a>
									</li>
									<li>
										<a href="#">Typography</a>
									</li>
									<li>
										<a href="#">FontAwesome</a>
									</li>
									<li>
										<a href="#">Slider</a>
									</li>
									<li>
										<a href="#">Panels</a>
									</li>
									<li>
										<a href="#">Widgets</a>
									</li>
									<li>
										<a href="#">Bootstrap Model</a>
									</li>
								</ul>


								<li data-toggle="collapse" data-target="#service" class="collapsed">
									<a href="#">
										<i class="fa fa-globe fa-lg"></i>
										Services
										<span class="arrow"></span>
									</a>
								</li>
								<ul class="sub-menu collapse" id="service">
									<li>New Service 1</li>
									<li>New Service 2</li>
									<li>New Service 3</li>
								</ul>


								<li data-toggle="collapse" data-target="#new" class="collapsed">
									<a href="#">
										<i class="fa fa-car fa-lg"></i>
										New
										<span class="arrow"></span>
									</a>
								</li>
								<ul class="sub-menu collapse" id="new">
									<li>New New 1</li>
									<li>New New 2</li>
									<li>New New 3</li>
								</ul>


								<li>
									<a href="#">
										<i class="fa fa-user fa-lg"></i>
										Profile
									</a>
								</li>

								<li>
									<a href="#">
										<i class="fa fa-users fa-lg"></i>
										Users
									</a>
								</li>
							</ul>
						</div>
					</div>
				</div>
				<div class="col-md-8">
					

				</div>
			</div>

		</div>


		<!-- javascript -->
		<script src="js/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>

	</body>
</html>