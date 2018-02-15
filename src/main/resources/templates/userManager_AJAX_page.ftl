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
<style type="text/css">
span.error {
	color: red;
	margin-left: 5px;
}
</style>
<script type="text/javascript">
$(function() {
   $('button[type=submit]').click(function(e) {   
      e.preventDefault();      
      $('input').next().remove();      
      $.post({
         url : 'saveuser',
         data : $('form[name=userDetailForm]').serialize(),
         success : function(res) {         
            if(res.validated){
        $('#resultContainer pre code').text(JSON.stringify(res.userDetail));
               $('#resultContainer').show();
               
               /* $(window.location).attr('href', '/SpringAJAX/emp'); */
            }else{
              $.each(res.errorMessages,function(key,value){
               $('input[name='+key+']').after('<span class="error">'+value+'</span>');
              });
            }
         }
      })
   });
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

		<div class="container-fluid">
			<h2>All Users</h2>
			<div class="table-responsive">
				<table class="table table-bordered table-stripped text-center">
					<tr class="mybackground2">
						<th class="text-center">Id</th>
						<th class="text-center">Fistname</th>
						<th class="text-center">Lastname</th>
						<th class="text-center">Email</th>
						<th class="text-center">Password</th>
						<th class="text-center">Mobile</th>
						<th class="text-center">Status</th>
						<th class="text-center">BillingAddress</th>
						<th class="text-center">BillingCountry</th>

						<!-- <th class="text-center">BillingAddress</th> <th class="text-center">BillingCity</th> 
							<th class="text-center">BillingZipCode</th> -->
						<!-- <th class="text-center">ShippingAddress</th> <th class="text-center">ShippingCity</th> 
							<th class="text-center">ShippingZipCode</th> -->
						<th class="text-center">ShippingAddress</th>
						<th class="text-center">ShippingCountry</th>
					</tr>
					<#list userDetails as userDetail>
					<tr>
						<td>${userDetail.id}</td>
						<td>${userDetail.userFirstName}</td>
						<td>${userDetail.userLastName}</td>
						<td>${userDetail.userEmail}</td>
						<td>${userDetail.userPassword}</td>
						<td>${userDetail.userMobile}</td>
						<td>
							<#if userDetail.userStatus == '0'>
							Not active
							<#elseif
							userDetail.userStatus == '1'>
							Active
							</#if>
						</td>
						<td>
							${userDetail.userBillingAddress},
							<br>
								${userDetail.userBillingCity},
								${userDetail.userBillingZipCode}
						</td>
						<td>${userDetail.userBillingCountry.getCountryName()}</td>
						<td>
							${userDetail.userShippingAddress},
							<br>
								${userDetail.userShippingCity},
								${userDetail.userShippingZipCode}
						</td>
						<td>${userDetail.userShippingCountry.getCountryName()}</td>
						<!-- <td>${userDetail.userBillingAddress}</td> <td>${userDetail.userBillingCity}</td> 
							<td>${userDetail.userBillingZipCode}</td> <td>${userDetail.userBillingCountry.getCountryName()}</td> 
							<td>${userDetail.userShippingAddress}</td> <td>${userDetail.userShippingCity}</td> 
							<td>${userDetail.userShippingZipCode}</td> <td>${userDetail.userShippingCountry.getCountryName()}</td> -->
					</tr>
					</#list>
				</table>
			</div>
			<a class="btn btn-default mybutton1 pull-right" href="#">
				<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
				Add product
			</a>
			<a class="btn btn-default mybutton2 pull-left" href="#">
				<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
				Back
			</a>

		</div>
		<br>

			<div class="container-fluid">
				<form action="saveuser" method="POST" name="userDetailForm">
					<table>
						<tr>
							<td>First Name</td>
							<td>
								<input name="userFirstName" type="text" />
							</td>
						</tr>
						<tr>
							<td>Last Name</td>
							<td>
								<input name="userLastName" type="text" />
							</td>
						</tr>
						<tr>
							<td>Email</td>
							<td>
								<input name="userEmail" type="text" />
							</td>
						</tr>
						
						<tr>
							<td></td>
							<td>
								<button type="submit">Submit</button>
							</td>
						</tr>
					</table>
				</form>
				<div id="resultContainer" style="display: none;">
					<hr />
					<h4 style="color: green;">JSON Response From Server</h4>
					<pre style="color: green;">
						<code></code>
					</pre>
				</div>
			</div>

			<!-- javascript -->
			<script src="../js/jquery.min.js"></script>
			<script src="../js/bootstrap.min.js"></script>

	</body>
</html>