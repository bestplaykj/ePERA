$(function(){
	
	$("#ciBtn").on("click", function(){
		
		$.ajax({
			
			url:"getEmptyRooms.do",
			type:"post",
			dataType:"json",
			success:function(data){
				
			},
			error:function(){console.log("응 안됨");}
			
		});
		
	});
	
});