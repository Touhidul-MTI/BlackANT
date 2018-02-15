var flag=true
function take(){
    $.getJSON( "../js/dataset.json", function( data ) {  

        if(flag){
            var output="<table class='table'><tr><th>Name</th><th>Id</th><th>Email</th><th>Age</th></tr>";

            $.each( data, function( key, val ) {
                output+="<tr><td>"+val.name+"</td><td>"+val.id+"</td><td>"+val.email+"</td><td>"+val.age+"</td></tr>";
            });

            output+="</table>";
            $("#tableId").append(output);

            flag=false;
        }

    });
}
