////-----get json data using post method-----
//function bypost() {
//	
//	$.post({
//		url: '/emp',
//		success : function(responsedData) { 
//			
//			var output="<table class='table table-responsive'><tr><th>First name</th><th>last name</th><th>Email</th><th>Designation</th></tr>";
//			$.each( responsedData.employeeList, function( key, val ) {
//		       
//				output+="<tr><td>"+val.firstName+"</td><td>"+val.lastName
//		       +"</td><td>"+val.email+"</td><td>"+val.designation+"</td></tr>"; 
//				
//		     });
//			
//			 output+="</table>";
//	         $("#tableId2").append(output);
//		},
//		error: function() {
//			console.log('cant read');
//		}
//	})
//}

////-----get json data using get method-----
//function byget(){
//document.getElementById("i").innerHTML='das';
//$.get({
//	url: '/employees',
//	success : function(responsedData) { 
//		
//		var output="<table class='table table-responsive'><tr><th>First name</th><th>last name</th><th>Email</th><th>Designation</th></tr>";
//		$.each( responsedData, function( key, val ) {
//	       
//			output+="<tr><td>"+val.firstName+"</td><td>"+val.lastName
//	       +"</td><td>"+val.email+"</td><td>"+val.designation+"</td></tr>"; 
//			
//	     });
//		
//		 output+="</table>";
//         $("#tableId").append(output);
//	}
//})
//}

////-----get json data using get method-----
//$(document).ready(function () {
//	
//	$.get({
//		url: '/employees',
//		success : function(responsedData) { 
//			
//			var output="";
//			$.each( responsedData, function( key, val ) {
//		       
//				output+="<tr><td>"+val.id+"</td><td>"+val.firstName+"</td><td>"+val.lastName
//		       +"</td><td>"+val.email+"</td><td>"+val.designation+"</td></tr>"; 
//				
//		     });
//			
//	         $("#tableId").append(output);
//		}
//	})
//});
//var pages = responsedData.pages;
//	var from = 1;
//	var to = pages.getTotalElements();


//---------Pagination starts here------
//var pages;
//var numberOfElementsInEachPage = 3;
//var responsedData;
//
//function setTable(response) {
//	responsedData = response;
//
//	pages = responsedData.pages;
//
//	var pageNumber = 1;
//	showPage(pageNumber);
//
//	createPagination();
//}
//
//function createPagination() {
//	var totalNumberOfElements = pages.numberOfElements;
//
//	var totalPages = Math.floor(totalNumberOfElements
//			/ numberOfElementsInEachPage);
//	if (Math.floor(totalNumberOfElements % numberOfElementsInEachPage) > 0) {
//		totalPages++;
//	}
//
//	var pagination = "";
//	for (var pageNumber = 1; pageNumber <= totalPages; pageNumber++) {
//		pagination += "<li><button onclick='showPage(" + pageNumber + ")'>"
//				+ pageNumber + "</button></li>"
//	}
//
//	$("#pageId").append(pagination);
//}
//function showPage(pageNumber) {
//
//	var toPage = pageNumber * numberOfElementsInEachPage;
//	var fromPage = toPage - numberOfElementsInEachPage;
//	
//	var employeeList = responsedData.employeeList;
//
//	$("#tableId tbody tr").empty();
//
//	var output = "<tbody>";
//	
//	for( ;fromPage < toPage; fromPage++){
//		
//		if(fromPage < employeeList.length){
//			var val = employeeList[fromPage];
//			
//			output += "<tr><td>" + val.id + "</td><td>" + val.firstName
//			+ "</td><td>" + val.lastName + "</td><td>" + val.email
//			+ "</td><td>" + val.designation + "</td></tr>";
//		}
//	}
//
//	output += "</tbody>";
//	$("#tableId").append(output);
//}

////--another way 
//function showPage(pageNumber) {
//
//	var toPage = pageNumber * numberOfElementsInEachPage;
//	var fromPage = toPage - numberOfElementsInEachPage + 1;
//
//	$("#tableId tbody tr").empty();
//
//	var pageCounter = 1;
//	var output = "<tbody>";
//	
//	$.each(responsedData.employeeList, function(key, val) {
//
//		if (pageCounter >= fromPage && pageCounter <= toPage) {
//
//			output += "<tr><td>" + val.id + "</td><td>" + val.firstName
//					+ "</td><td>" + val.lastName + "</td><td>" + val.email
//					+ "</td><td>" + val.designation + "</td></tr>";
//			
//		} else if (pageCounter > toPage) {
//			return;
//		}
//		pageCounter++;
//	});
//
//	output += "</tbody>";
//	$("#tableId").append(output);
//}

//-------Pagination ends here-------
