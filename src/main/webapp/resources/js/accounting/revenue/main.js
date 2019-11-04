$(function(){
	
	$.ajax({
		url:"getRevyMonth.do",
		type:"post",
		dataType:"json",
		success:function(data){
			if(data.length > 0){
				$.each(data, function(index, value){
					var option = $("<option value="+value+">"+value+"</option>");
					$("#yMonthSel").append(option);
				});
			}
		},
		error:function(){consol.log("응 아니먀");}
		
	});
		
});