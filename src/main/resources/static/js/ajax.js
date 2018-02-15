$(function() {
   $('button[type=submit]').click(function(e) {   
      e.preventDefault();      
      $('input').next().remove();      
      $.post({
         url : 'saveEmployee',
         data : $('form[name=employeeForm]').serialize(),
         success : function(res) {         
            if(res.validated){
        $('#resultContainer pre code').text(JSON.stringify(res.employee));
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