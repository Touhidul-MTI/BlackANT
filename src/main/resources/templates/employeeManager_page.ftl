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
										<script src="../js/jquery.min.js"></script>
										<script type="text/javascript" src="../js/pagination_blackant.js"></script>
<!-- 
written this document ready inside header, 
otherwise get method is called twice which makes the table value double
-->
<script type="text/javascript">
$(document).ready(function () {
	$.post({
		url: '/employeepagination',
		success : function(response) { 
			setTable(response);
		},
		error: function() {
			console.log('cant read');
		}
	})
});
</script>

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
			
			<p id="resultContainer" class="text-danger"></p>
			<div class="table-responsive">
				<table id="tableId" class="table table-bordered table-stripped text-center">
					<thead>
						<tr class="mybackground2">
							<th class="text-center">Serial No.</th>
							<th class="text-center">Id</th>
							<th class="text-center">First Name</th>
							<th class="text-center">Last Name</th>
							<th class="text-center">Email</th>
							<th class="text-center">Designation</th>
							<th class="text-center">Delete</th>
							<th class="text-center">Edit</th>
						</tr>
					</thead>
				</table>
			</div>
			<a class="btn btn-default mybutton1 pull-right" href="/addemployee">
				<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
				Add Employee
			</a>
			<div class="float-right">
				<ul class="pager" id="pageId">
				</ul>
			</div>
		</div>
		
		<br>

			<!-- javascript -->
			<script src="../js/bootstrap.min.js"></script>
	</body>
</html>