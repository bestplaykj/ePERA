$(function(){
	
	var date = new Date();
	var month = date.getMonth()+1;
	if(month < 10){
		month = "0"+month;
	}	
	var today = date.getFullYear()+"-"+month+"-"+date.getDate();
	$("#RSViDate").val(today);
	
	
	
	
	$("#RSViDate").on("change", function(){
		
		var idate = new Date($("#RSViDate").val());
		
		var diff = (idate.getTime() - date.getTime()) / (1000*60*60*24);
		if(diff < 0){
			alert("unable to select")
			$("#RSViDate").val(today);
		}
		
	});
	
	
	$("#RSVoDate").on("change", function(){
		
		var idate = new Date($("#RSViDate").val());
		var odate = new Date($("#RSVoDate").val());
		
		var diff = odate.getTime() - idate.getTime();
		var night = diff / (1000*60*60*24);
		
		if(diff < 1){
			alert("unable to select");
			$("#RSVoDate").val(null);
		}else{
			$("#RSVnight").val(night);			
		}
				
	});
	
	
	$("#roomSel").on("change", function(){
		
		var sel = $("#roomSel option:selected").val();
		var night = $("#RSVnight").val();
		
		$.ajax({
			url:"getRSVpirce.do",
			data:{type:sel},
			type:"post",
			success:function(data){
				if(data > 0){
					var price = data;
					$("#RSVprice").val(price);
					$("#RSVsales").val(price*night);
				}else{
					alert("응 안됨");
				}
			},
			error:function(){console.log("응 안됨");}
		})
		
	});
	
	
	$("#RSVnight").on("change", function(){
		
		var night = $("#RSVnight").val();
		var price = $("#RSVprice").val();
		
		$("#RSVsales").val(price*night);
		
	});
	
		
});