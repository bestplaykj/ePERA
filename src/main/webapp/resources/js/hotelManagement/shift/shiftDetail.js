$(function(){
	
	$("#changeBtn").on("click", function(){
		
		$.ajax({
			
			url:"getEmpNameAjx.do",
			type:"post",
			dataType:"json",
			success:function(data){
				$("#nameSelect").css("visibility", "visible");
				if(data.length > 0){					
					$.each(data, function(index, value){
						var option = $("<option value="+value.id+">"+value.name+"</option>");
						$("#nameSelect").append(option);
					});
				}
			},
			error:function(){console.log("응 안됨");}
			
		});
		
	});
	
	
	$("#nameSelect").on("change", function(){
		
		var sel = $("#nameSelect option:selected").val();
		
		$("#shiftName").val($("#nameSelect option:selected").text());
		$("#shiftId").val(sel);
		
	});
	
	
});