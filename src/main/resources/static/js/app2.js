$(document).ready(function() {
    $.ajax({
        url: "/employees"
    }).then(function(data) {
       $('.greeting-id').append(data.firstName);
       $('.greeting-content').append(data.content);
    });
});

function tab(){
	$.getJSON('../employees', function (data) {
		success : function(res) { 
		
		$.each( data, function( key, val ) {
		var a='<tr>'+val.id+'</tr>';
		    	
		 });
		  $('#tabl').append(a);
			
		}
	});
}
//$(document).ready(function () {
//	$.getJSON('../employees', function (data) {
//	success : function(res) { 
//	
//	$.each( data, function( key, val ) {
//	var a='<tr>'+val.id+'</tr>';
//	    	
//	 });
//	  $('#tabl').append(a);
//		
//	}
//});
//});
//
