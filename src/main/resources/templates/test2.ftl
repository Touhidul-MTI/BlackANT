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
									<link rel="stylesheet" href="../css/style_double_navbar.css">
										<link rel="stylesheet" href="../css/style_form.css">
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
						<img src="/img/blackant_logo4.png">
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

					<h3>Categories</h3>
					<!-- menu -->
					<div id="MainMenu">
						<div class="list-group panel">
							<a href="#" class="list-group-item list-group-item-success"
								data-parent="#MainMenu">Vehicle -Item 1</a>
							<a href="#" class="list-group-item list-group-item-success"
								data-parent="#MainMenu">Mobile -Item 2</a>
							<a href="#demo3" class="list-group-item list-group-item-success"
								data-toggle="collapse" data-parent="#MainMenu">
								Coothing -Item 3
								<i class="fa fa-caret-down"></i>
							</a>
							<div class="collapse" id="demo3">
								<a href="#SubMenu1" class="list-group-item" data-toggle="collapse"
									data-parent="#SubMenu1">
									Male -Subitem 1
									<i class="fa fa-caret-down"></i>
								</a>
								<div class="collapse list-group-submenu" id="SubMenu1">
									<a href="#" class="list-group-item" data-parent="#SubMenu1">T-Shirt -Subitem 1 a</a>
									<a href="#" class="list-group-item" data-parent="#SubMenu1">Pant -Subitem 2 b</a>
									<a href="#SubSubMenu1" class="list-group-item" data-toggle="collapse"
										data-parent="#SubSubMenu1">
										Shirt -Subitem 3 c
										<i class="fa fa-caret-down"></i>
									</a>
									<div class="collapse list-group-submenu list-group-submenu-1"
										id="SubSubMenu1">
										<a href="#" class="list-group-item" data-parent="#SubSubMenu1">Full shirt -Sub sub item
											1</a>
										<a href="#" class="list-group-item" data-parent="#SubSubMenu1">Half shirt -Sub sub item
											2</a>
									</div>
									<a href="#" class="list-group-item" data-parent="#SubMenu1">Panjabi -Subitem 4 d</a>
								</div><!-- end of SubMenu1 -->
								
								<a href="javascript:;" class="list-group-item">Female -Subitem 2</a>
								<a href="javascript:;" class="list-group-item">Child -Subitem 3</a>
							</div><!-- end of demo3 -->
							
							<a href="#demo4" class="list-group-item list-group-item-success"
								data-toggle="collapse" data-parent="#MainMenu">
								Accessories -Item 4
								<i class="fa fa-caret-down"></i>
							</a>
							<div class="collapse" id="demo4">
								<a href="" class="list-group-item">Kitchen -Subitem 1</a>
								<a href="" class="list-group-item">Mobile -Subitem 2</a>
								<a href="" class="list-group-item">Computer -Subitem 3</a>
							</div>
						</div>
					</div><!-- end of MainMenu -->
				</div>
				<div class="col-md-8">
					<div class="container">
						<form class="form-signin panel panel-default mybackground2">
							<h2 class="form-signin-heading">Please sign in</h2>

							<label for="inputEmail" class="sr-only">Email address</label>
							<input type="email" id="inputEmail" class="form-control"
								placeholder="Email address" required autofocus>
								<label for="inputPassword" class="sr-only">Password</label>
								<input type="password" id="inputPassword" class="form-control"
									placeholder="Password" required>

									<div class="checkbox">
										<label>
											<input type="checkbox" value="remember-me"> Remember me
										</label>
									</div>
									<button class="btn  btn-block bt" type="submit">Sign
										in</button>
						</form>

					</div> <!-- /container -->

				</div>
			</div>

		</div>


		<!-- javascript -->
		<script src="../js/jquery.min.js"></script>
		<script src="../js/bootstrap.min.js"></script>

	</body>
</html>