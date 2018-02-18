$(function() {
   $('button[type=submit]').click(function(e) {   
      e.preventDefault();      
      $('input').next().remove();      
      $.post({
         url : 'employeeupdater',
         data : $('form[name=employeeForm]').serialize(),
         success : function(res) {         
            if(res.validated){
            	$('#formId')[0].reset();
            	$('#resultContainer pre code').text("Successfully updated!");
               $('#resultContainer').show();
               
               /* $(window.location).attr('href', '/SpringAJAX/emp'); */
            }else{
            	 $('#resultContainer').hide();
              $.each(res.errorMessages,function(key,value){
               $('input[name='+key+']').after('<span class="error">'+value+'</span>');
              });
            }
         }
      })
   });
});