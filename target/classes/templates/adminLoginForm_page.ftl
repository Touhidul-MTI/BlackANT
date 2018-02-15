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
									<link rel="stylesheet" href="../css/style_form.css">

	</head>
	<body class="custom-body">

		<div class="container">

			<div class="mymargin10">
				<a href="/">
					<img src="img/blackant_logo_other.png" class="img-responsive center-block logo" />
				</a>
			</div>

			<form class="form-signin panel panel-default mybackground1"
				action="adminVarify" method="POST" modelAttribute="adminModel">
				<h2 class="form-signin-heading">Sign in</h2>

				<label for="inputEmail" class="sr-only">Email address</label>
				<input type="email" name="email" id="email" class="form-control"
					placeholder="Email address" required autofocus>
					<label for="inputPassword" class="sr-only">Password</label>
					<input type="password" name="password" id="password" class="form-control"
						placeholder="Password" required>

						<div class="checkbox">
							<label>
								<input type="checkbox" value="remember-me"> Remember me
							</label>
						</div>
						<button class="btn  btn-block mybutton1" type="submit">Sign in</button>

			</form>

		</div> <!-- /container -->

		<!-- javascript -->
		<script src="../js/jquery.min.js"></script>
		<script src="../js/bootstrap.min.js"></script>

	</body>
</html>