$(function(){
	
	$("#shiftName").on("change", function(){
		
		$("#shiftID").empty();
		var name = $("#shiftName").val();
		
		$.ajax({
			
			url:"getEmpIdAjax.do",
			type:"post",
			data:{name:name},
			dataType:"json",
			success:function(data){
				$("#shiftID").val(data);
			},
			error:function(){console.log("응 안됨");}
			
		});
		
	});
	
});