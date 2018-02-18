//---------Pagination starts here------
var pages;
var numberOfElementsInEachPage = 3;
var responsedData;

function setTable(response) {
	responsedData = response;

	pages = responsedData.pages;

	var pageNumber = 1;
	showPage(pageNumber);

	createPagination();
}

function createPagination() {
	var totalNumberOfElements = pages.numberOfElements;

	var totalPages = Math.floor(totalNumberOfElements
			/ numberOfElementsInEachPage);
	if (Math.floor(totalNumberOfElements % numberOfElementsInEachPage) > 0) {
		totalPages++;
	}

	var pagination = "";
	for (var pageNumber = 1; pageNumber <= totalPages; pageNumber++) {
		pagination += "<li><button onclick='showPage(" + pageNumber + ")'>"
				+ pageNumber + "</button></li>"
	}

	$("#pageId").append(pagination);
}
function showPage(pageNumber) {

	var toPage = pageNumber * numberOfElementsInEachPage;
	var fromPage = toPage - numberOfElementsInEachPage;

	var employeeList = responsedData.employeeList;

	$("#tableId tbody tr").empty();

	var output = "<tbody>";

	for (; fromPage < toPage; fromPage++) {

		if (fromPage < employeeList.length) {
			var val = employeeList[fromPage];

			output += "<tr><td>" + (fromPage+1) + "</td><td>"
			+ val.id + "</td><td>" + val.firstName
			+ "</td><td>" + val.lastName + "</td><td>" + val.email
			+ "</td><td>" + val.designation + "</td>"
			+ '<td>'
        	+ '<a onclick=deleteEmployee($(this),'+val.id+')>'
			+ '<span class="glyphicon glyphicon-trash" aria-hidden="true"></span></a>'
			+ '</td>'
			+ '<td>'
			+ '<a href="/updateemployee/'+val.id+'">'
			+ '<span class="glyphicon glyphicon-edit" aria-hidden="true"></span></a>'
			+ '</td>'
			+ "</tr>";
		}
	}

	output += "</tbody>";
	$("#tableId").append(output);
}

function deleteEmployee(thisTable, employeeId) {
	if (confirm('Employee will be deleted, are you sure?')) {
		
		$.ajax({
			type : "DELETE",
			url : 'deleteemployee/' + employeeId,

			success : function(response) {
				$('#resultContainer').text(
						'Id = ' + employeeId + ' has been deleted!');
				$('#resultContainer').show();

				thisTable.closest("tr").remove();

				window.location.reload();
			},

			failure : function(errMsg) {
				console.log(errMsg.toString())
			}
		});
	}
}

//function updateEmployee(id) {
//	
//	$.ajax({
//		type : "post",
//		url : 'updateemployee/' + employeeId,
//
//		success : function(response) {
//			$('#resultContainer').text(
//					'Id = ' + employeeId + ' has been deleted!');
//			$('#resultContainer').show();
//
//			thisTable.closest("tr").remove();
//
//			window.location.reload();
//		},
//
//		failure : function(errMsg) {
//			console.log(errMsg.toString())
//		}
//	});
//}

