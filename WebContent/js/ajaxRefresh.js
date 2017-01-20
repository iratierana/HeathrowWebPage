

$(document).ready(function(){
	$('#button').click(function(){

		$.ajax({
	       url: 'idSearcher', // action to be perform
	       type: 'POST',       //type of posting the data
	       data: { 
	    	   airplaneId: $("#airplaneId").val(),
	    	   flightId: $("#flightId").val() }, // data to set to Action Class
	       dataType: 'html',
	       success: function (html) {
	       $('#aside').html(html); //set result.jsp output to leftDiv 
	    	   console.log(html);
	       },
	       error: function(xhr, ajaxOptions, thrownError){
	          alert('The airplane id or flight id does not exist');
	       },
		});
    });
})