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
			<div class="col-md-3 col-sm-2"></div>
			<div class="col-md-6 col-sm-8 panel panel-default mybackground1">
				<h2 class="text-center mycolor4">Update product</h2>
				<br>
					<form class="form-horizontal" action="../productupdater"
						method="POST" modelAttribute="product" enctype="multipart/form-data">

						<div class="form-group">
							<label for="id" class="col-sm-4 control-label">Id (don't change)</label>
							<div class="col-sm-8">
								<input type="number" class="form-control" name="id"
									value="${productObj.id}" required>
							</div>
						</div>

						<div class="form-group">
							<label for="productName" class="col-sm-4 control-label">Product Name</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" name="productName"
									value="${productObj.productName}" required>
							</div>
						</div>

						<div class="form-group">
							<label for="productQuantity" class="col-sm-4 control-label">Quantity</label>
							<div class="col-sm-8">
								<input type="number" class="form-control" name="productQuantity"
									value="${productObj.productQuantity}" required>
							</div>
						</div>

						<div class="form-group">
							<label for="originalPrice" class="col-sm-4 control-label">Original Price</label>
							<div class="col-sm-8">
								<input type="number" class="form-control" name="originalPrice"
									value="${productObj.originalPrice}" required>
							</div>
						</div>

						<div class="form-group">
							<label for="discountPrice" class="col-sm-4 control-label">Discount Price</label>
							<div class="col-sm-8">
								<input type="number" class="form-control" name="discountPrice"
									value="${productObj.discountPrice}" required>
							</div>
						</div>
						<div class="form-group">
							<label for="productDescription" class="col-sm-4 control-label">Product Description</label>
							<div class="col-sm-8">
								<textarea type="text" class="form-control" name="productDescription"
									required>${productObj.productDescription}</textarea>
							</div>
						</div>
						<div class="form-group">
							<label for="category" class="col-sm-4 control-label">Category: (
								${productObj.category.getCategoryName()} )</label>
							<div class="col-sm-8">
								<select class="form-control" name="category" id="categoryId">
									<#list categories as category>
									<option value="${category.id}">${category.categoryName}</option>
									</#list>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label for="productImage" class="col-sm-4 
							control-label">Product Image
								${productObj.productImage}</label>
							<div class="col-sm-8">
								<input type="file" class="form-control" name="file"
									value="../product-images/${productObj.productImage}">
									<br>
										<img class="panel panel-default img-responsive" src="../product-images/${productObj.productImage}">
							</div>

						</div>
						<div class="form-group">
							<div class="col-sm-offset-4 col-sm-8">
								<button type="submit" class="btn btn-default mybutton1">Submit</button>
							</div>
						</div>
					</form>

					<a class="btn btn-default mybutton2 pull-right" href="/manageproducts">
						<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
						Back
					</a>
			</div>

			<div class="col-md-3 col-sm-2">
			</div>

		</div> <!-- /container -->


		<!-- javascript -->
		<script src="js/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>

	</body>
</html>