$(function(){
	
	$("#king").on("change", function(){
		if($("#king").val() == 'Y'){
			$("#kBed").css("visibility", "visible");
		}else{
			
			$("#kBed").css("visibility", "hidden");
		}
	});
	
	$("#queen").on("change", function(){
		if($("#queen").val() == 'Y'){
			$("#qBed").css("visibility", "visible");
		}else{
			
			$("#qBed").css("visibility", "hidden");
		}
	});
	
});