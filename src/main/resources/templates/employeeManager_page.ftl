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
										<script type="text/javascript" src="../js/app.js"></script>

										
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
			<h2 class="text-center">All Employees</h2>
			<div class="table-responsive">
				<table class="table table-bordered table-stripped text-center">
					<tr class="mybackground2">
						<th class="text-center">Id</th>
						<th class="text-center">First name</th>
						<th class="text-center">Last name</th>
						<th class="text-center">Email</th>
						<th class="text-center">Designation</th>
					</tr>
					<#list employees as employee>
					<tr>
						<td>${employee.id}</td>
						<td>${employee.firstName}</td>
						<td>${employee.lastName}</td>
						<td>${employee.email}</td>
						<td>${employee.designation}</td>

						<td>
							<a href="">
								<span class="glyphicon glyphicon-edit" aria-hidden="true"></span>
							</a>
						</td>
						<td>
							<a href=""
								onclick="if(confirm('Product will be deleted, are you sure?')){ return true; }else { return false; }">
								<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
							</a>
						</td>
					</tr>
					</#list>
				</table>
			</div>
			<a class="btn btn-default mybutton1 pull-right" href="/addemployee">
				<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
				Add emplyee
			</a>
		</div>
		<br>


			<div class="container panel panel-default">
				<#list employees as employee>
				<hr>
					<div class="row">

						<div class="col-md-2 col-sm-2 col-xs-2">${employee.id}</div>
						<div class="col-md-2 col-sm-2 col-xs-2">${employee.firstName}</div>
						<div class="col-md-2 col-sm-2 col-xs-2">${employee.lastName}</div>
						<div class="col-md-2 col-sm-2 col-xs-2">${employee.email}</div>
						<div class="col-md-2 col-sm-2 col-xs-2">${employee.designation}</div>

						<div class="col-md-1 col-sm-1">
							<a href="">
								<span class="glyphicon glyphicon-edit" aria-hidden="true"></span>
							</a>
						</div>
						<div class="col-md-1 col-sm-1">
							<a href="/deleteempoyee/${employee.id}"
								onclick="if(confirm('Product will be deleted, are you sure?')){ return true; }else { return false; }">
								<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
							</a>
						</div>
					</div>
					<hr>
						</#list>
			</div>

			<button onclick="take()" class="text-center">show Data</button>

			<div id="tableId" class="table-responsive">

			</div>
			
			


			<br>
				<!-- javascript -->
				<script src="../js/jquery.min.js"></script>
				<script src="../js/bootstrap.min.js"></script>

	</body>
</html>