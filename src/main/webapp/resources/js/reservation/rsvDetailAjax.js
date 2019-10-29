$(function(){
	
	$("#ciBtn").on("click", function(){
		
		$("#roomNoSel").empty();
		
		$.ajax({
			
			url:"getEmptyRooms.do",
			type:"post",
			dataType:"json",
			success:function(data){
				if(data.length > 0){
					$.each(data, function(index, value){
						var option = $("<option value="+value.no+">"+value.no+" ("+value.type+")</option>");
						$("#roomNoSel").append(option);
					});
				}else{
					alert("현재 공실이 없습니다.");
				}
			},
			error:function(){console.log("응 안됨");}
			
		});
		
	});
	
	
	$("#roomNoSel").on("change", function(){
		
		var roomNo = $("#roomNoSel").val();
		
		$.ajax({
			
			url:"getFloor.do",
			data:{roomNo:roomNo},
			type:"post",
			dataType:"json",
			success:function(data){
				$("#floorSel").val(data);
			},
			error:function(){console.log("응 안됨");}
			
		});
		
	});
	
	
});