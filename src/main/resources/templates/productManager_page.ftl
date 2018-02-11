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

		<div class="container-fluid">
			<h2>All products</h2>
			<div class="table-responsive">
				<table class="table table-bordered table-stripped text-center">
					<tr class="mybackground2">
						<th class="text-center">Product Id</th>
						<th class="text-center">Product Name</th>
						<th class="text-center">Product Quantity</th>
						<th class="text-center">Original Price</th>
						<th class="text-center">Discount Price</th>
						<th class="text-center">Product description</th>
						<th class="text-center">Image</th>
						<th class="text-center">Category</th>
						<th class="text-center">Edit</th>
						<th class="text-center">Delete</th>
					</tr>
					<#list products as product>
					<tr>
						<td>${product.id}</td>
						<td>${product.productName}</td>
						<td>${product.productQuantity}</td>
						<td>${product.originalPrice}</td>
						<td>${product.discountPrice}</td>
						<td class="mywidth_mx400">${product.productDescription}</td>
						<td>
							<img class="mywidth_mx100 img-responsive" src="../product-images/${product.productImage}">
						</td>
						<td>${product.category.getCategoryName()}</td>
						<td>
							<a href="/updateproduct/${product.id}">
								<span class="glyphicon glyphicon-edit" aria-hidden="true"></span>
							</a>
						</td>
						<td>
							<a href="/deleteproduct/${product.id}"
								onclick="if(confirm('Product will be deleted, are you sure?')){ return true; }else { return false; }">
								<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
							</a>
						</td>
					</tr>
					</#list>
				</table>
			</div>
			<a class="btn btn-default mybutton1 pull-right" href="/addproduct">
				<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
				Add product
			</a>
			<a class="btn btn-default mybutton2 pull-left" href="/adminVarify">
				<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
				Back
			</a>

		</div>
<br>
		<!-- javascript -->
		<script src="../js/jquery.min.js"></script>
		<script src="../js/bootstrap.min.js"></script>

	</body>
</html>