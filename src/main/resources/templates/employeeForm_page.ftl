<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
			<meta name="viewport" content="width=device-width, initial-scale=1.0">
				<title>BlackANT</title>
				<!-- css -->
				<link href="../css/bootstrap.min.css" rel="stylesheet">
					<link href="../css/animate.css" rel="stylesheet">
						<link rel="stylesheet" href="../css/font-awesome.min.css">
							<link rel="stylesheet" href="../css/style_default.css">
								<link rel="stylesheet" href="../css/style_single_navbar.css">
									<style type="text/css">
										span.error {
										color: red;
										margin-left: 5px;
										}
									</style>
									<script src="../js/jquery.min.js"></script>
									<script src="../js/employee_adder_blackant.js"></script>
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
			<div class="col-md-2 col-sm-2">
			</div>
			<div class="col-md-8 col-sm-8 panel panel-default">
			
			<form id="formId" class="form-horizontal" action="saveEmployee" method="post"
				name="employeeForm">

				<h3 class="text-center">Employee Input Form</h3>

				<div class="form-group">
					<label for="firstName" class="col-sm-4 control-label">First Name</label>
					<div class="col-sm-8">
						<input type="text" class="form-control" name="firstName"
							placeholder="First Name" required>
					</div>
				</div>


				<div class="form-group">
					<label for="lastName" class="col-sm-4 control-label">Last Name</label>
					<div class="col-sm-8">
						<input type="text" class="form-control" name="lastName"
							placeholder="Last Name" required>
					</div>
				</div>
				
				<div class="form-group">
					<label for="email" class="col-sm-4 control-label">Email</label>
					<div class="col-sm-8">
						<input type="email" class="form-control" name="email"
							placeholder="Email" required>
					</div>
				</div>

				<div class="form-group">
					<label for="designation" class="col-sm-4 control-label">Designation</label>
					<div class="col-sm-8">
						<input type="text" class="form-control" name="designation"
							placeholder="Designation" required>
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-4 col-sm-8">
						<button type="submit" class="btn btn-default mybutton1">Submit</button>
					</div>
				</div>

				<div id="resultContainer" style="display: none;">
					<pre style="color: green;">
						<code></code>
					</pre>
				</div>
				<a class="btn btn-default mybutton2 pull-left" href="/manageemployees">
					<span class="glyphicon glyphicon-chevron-left" aria-hidden="true">
					</span>Back</a>
			</form>
			
			</div>
			
			<div class="col-md-2 col-sm-2 col-xs-2">
			</div>
			
		</div>

		<script src="../js/bootstrap.min.js"></script>
	</body>
</html>